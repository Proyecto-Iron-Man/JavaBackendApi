package com.ironman.javabackendapi.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

// Lombok anotations
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

// JPA anotations
@Entity
@Table(name = "categories")
public class Category implements Serializable {
    // Attributes
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id")
    private Long categoryId;

    private String name;
    private String description;
    private String state;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
