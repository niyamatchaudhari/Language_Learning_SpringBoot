package com.example.languagelearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.languagelearning.model.RegistrationForm;
import com.example.languagelearning.repository.RegistrationFormRepository;

@Controller
public class RegistrationController {
	
	@Autowired
    private RegistrationFormRepository registrationFormRepository;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register"; // Renders register.html
    }

    @PostMapping("/register")
    public String registerUser(RegistrationForm registrationForm) {
        registrationFormRepository.save(registrationForm);
        return "redirect:/confirmation";
    }


}
