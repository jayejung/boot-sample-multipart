package com.ijys.bootsample.multipartsample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Main {
	@RequestMapping(value = "/")
	public ResponseEntity<?> index() {
		Map<String, String> testResponseMap = new HashMap();
		testResponseMap.put("status", "success");
		testResponseMap.put("message", "test");

		return new ResponseEntity(testResponseMap, HttpStatus.OK);
	}

	@RequestMapping(value = "/fileselector")
	public String fileUpload() {
		return "fileselector";
	}
}
