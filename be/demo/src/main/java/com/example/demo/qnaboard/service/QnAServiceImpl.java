package com.example.demo.qnaboard.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.domain.QnADto;
import com.example.demo.qnaboard.repository.QnARepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class QnAServiceImpl extends AbstractService<QnA> implements QnAService {

    @Override
    public void create(QnADto board) throws Exception {
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

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<QnA> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<QnA> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public QnA getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public QnA save(QnA entity) {
        // TODO Auto-generated method stub
        return null;
    }
}
