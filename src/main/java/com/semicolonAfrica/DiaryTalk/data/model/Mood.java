package com.semicolonAfrica.DiaryTalk.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String description;
}
