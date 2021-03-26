package com.example.demo.sns.domain;

import org.springframework.stereotype.Component;

import javassist.SerialVersionUID;
import lombok.Data;

@Component
@Data
public class SNSDto {
    private static final long serialVersionUID = 1L;
    private String username;
    private String sns_board;
    private String regdate;
    private String hit; //조회수
    
}
