package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String HomePage(){
        return "home"; // Không cần .html hoặc .jsp nếu dùng Thymeleaf
    }
}

