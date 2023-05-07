package com.blog.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class TableA {

    @Id
    @GeneratedValue
    UUID id;
    String title;
    String body;
    UUID secondaryId;
    Date date;


    public TableA(String s, String s1) {
        this.title = s;
        this.body = s1;
        this.secondaryId = UUID.randomUUID();
        this.date = Date.valueOf(LocalDate.now());
    }
}
