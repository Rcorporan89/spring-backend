package com.example.springbackend.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService {
    public boolean upload(MultipartFile file) {
        return true;
    }
}
