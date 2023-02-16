package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.service.PersonDetailsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    public final PersonDetailsService service;

    @GetMapping("/login")
    public String login() {
        return "auth/login";
    }

    @PostMapping("/reg")
    public Person save(@RequestBody Person person) {
        return this.service.reg(person);
    }
}
