package com.ironman.javabackendapi.expose.web;


import com.ironman.javabackendapi.persistence.entity.Category;
import com.ironman.javabackendapi.persistence.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// Lombok annotations
@RequiredArgsConstructor

// Spring annotations
@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> categories = (List<Category>) categoryRepository.findAll();

        return ResponseEntity.status(HttpStatus.OK)
                .body(categories);
    }


}
