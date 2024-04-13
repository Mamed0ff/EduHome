package com.example.eduhome.controller;

import com.example.eduhome.models.Course;
import com.example.eduhome.repostiories.*;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private CourseRepo courseRepo;

    @Autowired
    private ServiceRepo serviceRepo;

    @Autowired
    private SliderRepo sliderRepo;

    @Autowired
    private AboutRepo aboutRepo;

    @Autowired
    private BlogRepo blogRepo;

    @GetMapping("/")
    public String index(Model model ){
        model.addAttribute("blog", blogRepo.findTop3ByOrderByIdAsc());
        model.addAttribute("about", aboutRepo.findAll());
        model.addAttribute("courses", courseRepo.findTop3ByOrderByIdAsc());
        model.addAttribute("services", serviceRepo.findAll());
        model.addAttribute("sliders", sliderRepo.findAll());
        return "home";
    }
}
