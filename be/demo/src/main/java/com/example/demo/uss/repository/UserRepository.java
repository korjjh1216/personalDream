package com.example.demo.uss.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.query.Param;
import com.example.demo.uss.domain.User;


interface UserCustomRepository{
	
}
public interface UserRepository extends JpaRepository<User, Long>,UserCustomRepository {
	@Transactional
	@Query(value="select user_no, username from users where users.username=:username and users.password=:password", nativeQuery = true)
	public String login(@Param("username") String username,@Param("password") String password);
	
   
}
