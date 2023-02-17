package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.service.RegistrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    public final RegistrationService service;

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @PostMapping("/reg")
    public Person save(@RequestBody Person person) {
        return this.service.registration(person);
    }
}
