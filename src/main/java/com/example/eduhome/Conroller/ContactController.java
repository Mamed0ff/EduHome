package com.example.eduhome.Conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContactController {
    @GetMapping("/contact")
    public String index(){
        return "contact";
    }
}
