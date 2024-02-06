package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Users;
import com.example.demo.repo.UsersRepository;


@RestController
@RequestMapping
public class ApiController {
    @Autowired
    UsersRepository UserRepo;
    @SuppressWarnings("null")
    @GetMapping("hello/{id}")
    public String getMethodName(@PathVariable String id) {
        return UserRepo.findById(id).map(Users::toString).orElse("User not found");
    }
}
