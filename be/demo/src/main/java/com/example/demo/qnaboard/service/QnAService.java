package com.example.demo.qnaboard.service;

import java.util.List;

import com.example.demo.qnaboard.domain.QnADto;

public interface QnAService {
    public List<QnADto> list() throws Exception;

    public void register(QnADto board) throws Exception;

    public Board read(Integer boardNo) throws Exception;

    public void remove(Integer boardNo) throws Exception;

    public void modify(Board board) throws Exception;
}
