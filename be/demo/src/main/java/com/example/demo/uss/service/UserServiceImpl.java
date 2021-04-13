package com.example.demo.uss.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.cmm.service.AbstractService;
import com.example.demo.uss.domain.User;
import com.example.demo.uss.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl extends AbstractService<User> implements UserService {
	private final UserRepository userRepo;

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return userRepo.count();
	}

	@Override
	public boolean existsById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

	@Override
	public User getOne(long id) {
		// TODO Auto-generated method stub
		return userRepo.getOne(id);
	}

	@Override
	public User save(User entity) {
		// TODO Auto-generated method stub
		return userRepo.save(entity);
	}

	@Override
	public Optional<User> findById(long id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		userRepo.delete(entity);
	}

	@Override
	public String login(String username, String password) {
		// TODO Auto-generated method stub
		return userRepo.login(username, password);
	}
		
	
}
