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
public class DiaryEntries {
    @Id
    @GeneratedValue(strategy =GenerationType. AUTO)
    private Long id;
    private Long userId;
    private String title;
    private String content;
    private LocalDateTime CreatedEntry;
    private LocalDateTime UpdatedEntry;

}
