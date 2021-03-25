package com.example.demo.qnaboard.domain;

import java.util.Date;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "boards")
public class QnA {

    @Id
    @GeneratedValue
    @Column(name = "board_no")
    private long boardNo;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "use_name")
    private String userName;

    @Column(name = "reg_date")
    private Date regDate;

}
