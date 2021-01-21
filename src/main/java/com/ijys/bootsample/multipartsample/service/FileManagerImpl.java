package com.ijys.bootsample.multipartsample.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class FileManagerImpl {
	private final Path savePath = Paths.get("/Users/kakao/test/");

	public void save(MultipartFile file) {
		try {
			Files.copy(file.getInputStream(), this.savePath.resolve(file.getOriginalFilename()));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
