package com.example.demo.qnaboard.controller;

import com.example.demo.qnaboard.service.QnAServiceImpl;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@Log
@Controller
@RequiredArgsConstructor
public class QnAController {
    private final QnAServiceImpl service;
    
}
