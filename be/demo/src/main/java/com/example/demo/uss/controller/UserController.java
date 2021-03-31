package com.example.demo.uss.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.uss.domain.User;
import com.example.demo.uss.service.UserServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping(value="/user")
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class UserController {
    private final UserServiceImpl service;
    
    @PostMapping("")
    public ResponseEntity<?> doJoin(@RequestBody User user) {
    	System.out.println("doJoin()");
    	service.save(user);
    	return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @GetMapping("/list")
    public ResponseEntity<?> UserList(){
    	System.out.println("Get UserList()");
    	return new ResponseEntity<>(service.findAll(),HttpStatus.OK);
    }
}
