package com.ijys.bootsample.multipartsample.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileManager {
    void save(MultipartFile file);
}
