package com.cos.blog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Timestamp;

@Entity
public class User {

    @id//primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//프로젝트에 연결된 DB의 전략을 따라간다.
    private int id;//시퀀스, auto_increment

    private String username;

    private String password;

    private String email;

    private Timestamp createDate;

}
