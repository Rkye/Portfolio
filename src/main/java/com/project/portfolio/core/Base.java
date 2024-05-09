package com.project.portfolio.core;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass //Alt klasların database tablosuna buradaki kolonları eklemek için kullanılır.
@SuperBuilder
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @Column(name="deletedAt")
    private LocalDateTime deletedAt;

    @Column(name = "createdDate")
    private LocalDateTime createdDate;

    @Column(name = "lastModified")
    private LocalDateTime lastModified;

    @PrePersist
    protected void beforeCreate(){
        createdDate = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);
        isDeleted = false;
    }

    @PreUpdate
    protected void beforeUpdate(){
        lastModified = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);

    }
}
