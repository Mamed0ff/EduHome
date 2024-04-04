package com.example.eduhome.Conroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class EventController {
    @GetMapping("/events")
    public String index(){
        return "events";
    }
    @GetMapping("/events/details")
    public String details(){
        return "eventsDetails";
    }
}
