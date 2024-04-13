package com.example.eduhome.controller;

import com.example.eduhome.repostiories.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @Autowired
    BlogRepo blogRepo;
    @GetMapping("/blog")
    public String index(Model model){
        model.addAttribute("blogs", blogRepo.findAll());
        return "blog";
    }
    @GetMapping("/blog/details")
    public String details(){
        return "blogDetails";
    }

}
