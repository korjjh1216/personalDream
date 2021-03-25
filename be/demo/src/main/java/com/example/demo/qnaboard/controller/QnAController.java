package com.example.demo.qnaboard.controller;


import java.util.List;

import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.service.QnAService;

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
   private final QnAService service;
   
   @GetMapping("/create")
   public ResponseEntity<?> create(QnA qna){
      System.out.println("getQnACreaate()");

      return new ResponseEntity<>(HttpStatus.OK);
   }

   @GetMapping("/detail/itemNO")
	public ResponseEntity<QnA> read(long boardNo) {
		System.out.println("getQnABoardRead()");

		return new ResponseEntity<>(QnAService.read(boardNo), HttpStatus.OK);
	}

   @GetMapping("/list")
	public ResponseEntity<List<QnA>> list(){
		System.out.println("getQnAList()");

		return new ResponseEntity<>(QnAService.list(), HttpStatus.OK);
	}

   @GetMapping("/count")
	public ResponseEntity<Long> count(){
		System.out.println("getQnACount()");

		return new ResponseEntity<>(QnAService.count(), HttpStatus.OK);
	}
}
