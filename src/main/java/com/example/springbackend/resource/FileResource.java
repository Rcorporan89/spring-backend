package com.example.springbackend.resource;

import com.amazonaws.services.s3.model.S3Object;
import com.example.springbackend.service.FileService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("api/files")
public class FileResource {
    @Autowired
    private FileService fileService;
    @PostMapping
    public boolean upload(@RequestParam(name = "file")MultipartFile file) {
       return fileService.upload(file);
    }

    @GetMapping("/view")
    public void view(@RequestParam(name = "key")String key, HttpServletResponse response) throws IOException {
        S3Object object = fileService.getFile(key);
        response.setContentType(object.getObjectMetadata().getContentType());
        response.getOutputStream().write(object.getObjectContent().readAllBytes());
    }
}
