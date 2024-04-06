package com.example.eduhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CourseController {
    @GetMapping("/courses")
    public String index(){
        return "courses";
    }
    @GetMapping("/course/details")
    public String details(){
        return "courseDetails";
    }
}
