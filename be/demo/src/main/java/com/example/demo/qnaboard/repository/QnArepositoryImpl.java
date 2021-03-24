package com.example.demo.qnaboard.repository;

import java.util.List;

import com.example.demo.qnaboard.domain.QnADto;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class QnArepositoryImpl implements QnACustomRepository {

    @Override
    public void register(QnADto board) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public QnADto read(Long board_no) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modify(QnADto board) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void remove(Long board_no) throws Exception {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<QnADto> list() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }
}
