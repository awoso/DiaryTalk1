package com.semicolonAfrica.DiaryTalk.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
public class User {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String password;
    private String email;
    private String phoneNumber;
    private String address;
    private boolean isLogin;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
