package com.example.demo.qnaboard.service;


import java.util.List;

import com.example.demo.qnaboard.domain.QnADto;

public interface QnAService {
    public void create(QnADto board) throws Exception;
    public QnADto read(Long board_no) throws Exception;
    public void modify(QnADto board) throws Exception;
    public void remove(Long board_no) throws Exception;
    public List<QnADto> list() throws Exception;
}
