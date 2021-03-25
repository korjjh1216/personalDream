package com.example.demo.qnaboard.repository;

import com.example.demo.qnaboard.domain.QnA;
import com.example.demo.qnaboard.domain.QnADto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

interface QnACustomRepository{
  
}

public interface QnARepository extends JpaRepository<QnA, Long>,QnACustomRepository {
    @Query(value = "SELECT * FROM QnA i WHERE i.board_no = :boardNo", nativeQuery = true)
	public void create(@Param("boardNo") QnADto qna);

    @Query(value = "INSERT INTO boards i SELECT * FROM ", nativeQuery = true)
	public QnA detail(long boardNo);
}
