package com.example.demo.qnaboard.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class QnADto implements Serializable {
    private static final long SerialVersionUID = 1L;
    private long boardNo;
    private String title;
    private String content;
    private String userName;
    private Date regDate;
}
