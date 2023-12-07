package com.example.render_application.lunch_app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
  
    @GetMapping("/test")
    public String welcome()
    {
        return "welcome in the new world";
    }
}
