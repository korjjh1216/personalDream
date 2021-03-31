package com.example.demo.qnaboard.repository;

import com.example.demo.qnaboard.domain.QnA;
import org.springframework.data.jpa.repository.JpaRepository;

interface QnACustomRepository{

}

public interface QnARepository extends JpaRepository<QnA, Long>,QnACustomRepository {
   
}
