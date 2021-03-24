package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService {

    @Override
    public Optional<User> findOne() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<User> findById(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<User> findAllById(Iterable<User> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public User getOne(long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<User> saveAll(Iterable<User> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public User save(User entity) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
