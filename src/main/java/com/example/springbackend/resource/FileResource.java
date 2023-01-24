package com.example.springbackend.resource;

import com.example.springbackend.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/files")
public class FileResource {
    @Autowired
    private FileService fileService;
    @PostMapping
    public boolean upload(@RequestParam(name = "file")MultipartFile file) {
       return fileService.upload(file);
    }
}
