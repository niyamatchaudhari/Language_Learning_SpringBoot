package com.example.languagelearning.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {

    @GetMapping("/")
    public String home() {
        return "home"; // Renders home.html from the templates directory
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Renders about.html from the templates directory
    }

    @GetMapping("/registration")
    public String register() {
        return "register"; // Renders register.html from the templates directory
    }
    
    @GetMapping("/confirmation")
    public String confirmation() {
    	return "confirmation";
    }
    
    @GetMapping("/courses")
    public String courses() {
    	return "courses";
    }
    
    @GetMapping("/java_course")
    public String java_course() {
    	return "java_course";
    }
    
    @GetMapping("/html_course")
    public String html_course() {
    	return "html_course";
    }
    
    @GetMapping("/python_course")
    public String python_course() {
    	return "python_course";
    }
}
