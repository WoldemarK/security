package com.example.demo.controller;

import com.example.demo.security.PersonDetailsImpl;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {
    @GetMapping
    public String hello() {
        return "/hello";
    }

    @GetMapping("/showUserInfo")
    public String showUserInfo() {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetailsImpl personDetailsImpl = (PersonDetailsImpl) authentication.getPrincipal();
        System.out.println(personDetailsImpl.getPerson());

        return "HELLO showUserInfo";
    }
}
