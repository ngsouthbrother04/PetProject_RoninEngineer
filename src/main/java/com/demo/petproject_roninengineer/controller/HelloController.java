package com.demo.petproject_roninengineer.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HelloController {

    @GetMapping("/wel")
    public String wel() {
        return "Hello course online project";
    }

}