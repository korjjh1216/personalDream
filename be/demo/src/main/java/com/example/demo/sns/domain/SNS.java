package com.example.demo.sns.domain;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "snsboards")
public class SNS {
    
    @Id
    @GeneratedValue
    @Column(name = "username")
    private String username;
    
    @Column(name = "sns_content")
    private String board_content;

    @Column(name = "regdate")
    private String regdate;

    @Column(name = "hit")
    private String hit;
}
