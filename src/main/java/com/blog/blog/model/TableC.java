package com.blog.blog.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TableC {

    @Id
    UUID id;
    String title;
    @Column(name = "content_c", columnDefinition = "json")
    String contentC;

}
