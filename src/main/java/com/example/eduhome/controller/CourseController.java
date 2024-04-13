package com.example.eduhome.controller;

import com.example.eduhome.repostiories.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CourseController {
    @Autowired
    private CourseRepo courseRepo;

    @GetMapping("/courses")
    public String index(Model model ){
        model.addAttribute("courses", courseRepo.findAll());
        return "courses";
    }
    @GetMapping("/course/details")
    public String details(){
        return "courseDetails";
    }
}
