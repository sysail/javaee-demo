package com.chope.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping("/save")
    public String save() {
        System.out.println("user save");
        return "hello, springboot";
    }
}
