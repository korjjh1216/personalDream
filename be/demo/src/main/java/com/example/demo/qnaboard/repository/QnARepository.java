package com.example.demo.qnaboard.repository;

import java.util.List;

import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.domain.QnADto;

import org.springframework.data.jpa.repository.JpaRepository;

interface QnACustomRepository{
    public void register(QnADto board) throws Exception;
    public QnADto read(Long board_no) throws Exception;
    public void modify(QnADto board) throws Exception;
    public void remove(Long board_no) throws Exception;
    public List<QnADto> list() throws Exception;
}

public interface QnARepository extends JpaRepository<QnA, Long> {
    
}
