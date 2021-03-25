package com.example.demo.qnaboard.service;


import java.util.List;

import com.example.demo.qnaboard.domain.QnA;

public interface QnAService {
    public void create(QnA qna);
    public QnA read(Long boardNo);
    public List<QnA> list();
}
