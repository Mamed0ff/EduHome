package com.example.eduhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String index(){
        return "blog";
    }
    @GetMapping("/blog/details")
    public String details(){
        return "blogDetails";
    }

}
