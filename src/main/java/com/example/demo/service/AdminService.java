package com.example.demo.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    public void doAdminStuff(){
        System.out.println("Only admin here");
    }
}
