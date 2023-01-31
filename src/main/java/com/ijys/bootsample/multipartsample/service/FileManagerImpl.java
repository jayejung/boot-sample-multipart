package com.ijys.bootsample.multipartsample.service;

import com.ijys.bootsample.multipartsample.model.vo.PreferencesValues;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
@RequiredArgsConstructor
public class FileManagerImpl implements FileManager {
	private final PreferencesValues preferencesValues;

	@Override
	public void save(MultipartFile file) {
		final Path savePath = Paths.get(preferencesValues.getUploader().getPath());

		try {
			Files.copy(file.getInputStream(), savePath.resolve(file.getOriginalFilename()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
