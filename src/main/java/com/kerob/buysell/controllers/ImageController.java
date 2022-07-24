package com.kerob.buysell.controllers;

import com.kerob.buysell.models.Image;
import com.kerob.buysell.models.Product;
import com.kerob.buysell.repositories.ImageRepository;
import com.kerob.buysell.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class ImageController {
    private final ImageRepository imageReposetory;

    @GetMapping("/images/{id}")
    private ResponseEntity<?>  getImageById(@PathVariable Long id){
        Image image  =  imageReposetory.findById(id).orElse(null);
        return ResponseEntity.ok()
                .header("fileName", image.getOriginalFileName())
                .contentType(MediaType.valueOf(image.getContentType()))
                .contentLength(image.getSize())
                .body(new InputStreamResource(new ByteArrayInputStream(image.getBytes())));

    }


}
