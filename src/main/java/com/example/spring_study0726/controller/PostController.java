package com.example.spring_study0726.controller;

import com.example.spring_study0726.model.SearchParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    @PostMapping("/postMethod")
    public String postMethod(@RequestBody SearchParam searchParam){
        return "ok";

    }
}
