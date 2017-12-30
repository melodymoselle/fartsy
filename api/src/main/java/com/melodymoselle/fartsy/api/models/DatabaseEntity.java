package com.melodymoselle.fartsy.api.models;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class DatabaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "Id", updatable = false, nullable = false)
        private Long id;

        @CreatedDate
        @Column(name = "Created_Date", nullable = false)
        private LocalDateTime createdDate;

        @LastModifiedDate
        @Column(name = "Last_Modified_Date", nullable = false)
        private LocalDateTime lastModifiedDate;

        public Long getId() {
            return id;
        }

        public LocalDateTime getCreatedDate() {
            return createdDate;
        }
        public LocalDateTime getLastModifiedDate() {
            return lastModifiedDate;
        }
    }
