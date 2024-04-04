package com.example.eduhome.Conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class TeacherController {
    @GetMapping("/teachers")
    public String index(){
        return "teacher";
    }
    @GetMapping("/teachers/details")
    public String details(){
        return "teacherDetails";
    }
}
