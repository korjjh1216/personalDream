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
    private final QnARepository qnaRepo;

    @Override
    public void create(QnA qna) {
        // TODO Auto-generated method stub
        return qnaRepo.create(qna);
    }

    @Override
    public QnA read(Long boardNo) {
        // TODO Auto-generated method stub
        return qnaRepo.read(boardNo);
    }

    @Override
    public List<QnA> list() {
        // TODO Auto-generated method stub
        return qnaRepo.list();
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return qnaRepo.count();
    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return qnaRepo.existsById(id);
    }

    @Override
    public List<QnA> findAll() {
        // TODO Auto-generated method stub
        return qnaRepo.findAll();
    }

    @Override
    public Optional<QnA> findOne() {
        // TODO Auto-generated method stub
        return qnaRepo.findOne(null);
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        return qnaRepo.deleteById(id);
        
    }

    @Override
    public QnA getOne(long id) {
        // TODO Auto-generated method stub
        return qnaRepo.getOne(id);
    }

    @Override
    public QnA save(QnA entity) {
        // TODO Auto-generated method stub
        return qnaRepo.save(entity);
    }
}