package com.example.demo.qnaboard.controller;


import java.util.List;
import java.util.Optional;

import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.service.QnAServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RestController @RequiredArgsConstructor
@RequestMapping(value="/qna")
@CrossOrigin(origins ="*", allowedHeaders = "*")
public class QnAController {
   private final QnAServiceImpl service;
   
   

   @PostMapping("")
	public ResponseEntity<?> doCreate(@RequestBody QnA qna){
		System.out.println("doCreate()"+qna.toString());
		service.save(qna);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
   
   @GetMapping("/list")
	public ResponseEntity<?> findAll(){
		System.out.println("getQnAFindAll()");

		return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
	}
   
   @GetMapping("/read/{id}")
   public ResponseEntity<Optional<QnA>> findById(@PathVariable long id){
	   System.out.println("findQnAOne");
	   System.out.println("======= 게시글 리딩중 =======");
	   
	   return new ResponseEntity<>(service.findById(id),HttpStatus.OK);
   }
   
}
