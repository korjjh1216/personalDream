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
	@Query(value="select * from users "
			+ "where username= :username and password= :password", nativeQuery = true)
	User login(@Param("username") String username,@Param("password") String password);
	
   
}
