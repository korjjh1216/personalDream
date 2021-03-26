package com.example.demo.qnaboard.controller;


import java.util.List;

import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.service.QnAServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(value="/qna")
public class QnAController {
   private final QnAServiceImpl service;
   
   @GetMapping("/create")
   public ResponseEntity<?> create(QnA qna){
      System.out.println("getQnACreaate()");

      return new ResponseEntity<>(HttpStatus.OK);
   }

   @GetMapping("/list")
	public ResponseEntity<List<QnA>> findAll(){
		System.out.println("getQnAFindAll()");

		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
}
