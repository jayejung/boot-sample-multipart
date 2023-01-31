package com.ijys.bootsample.multipartsample.controller;

import com.ijys.bootsample.multipartsample.service.FileManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/file")
public class FileTransfer {
	@Autowired
	FileManager fileManager;

	@PostMapping("/upload")
	public ResponseEntity<?> upload(@RequestParam("testfile")MultipartFile file) {
		fileManager.save(file);
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("status", "success");

		return new ResponseEntity(resultMap, HttpStatus.OK);
	}

}
