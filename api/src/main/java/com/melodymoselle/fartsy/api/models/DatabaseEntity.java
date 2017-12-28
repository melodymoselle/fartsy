package com.melodymoselle.fartsy.api.models;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.*;

import javax.persistence.*;
import javax.persistence.Temporal;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class DatabaseEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "Id", updatable = false, nullable = false)
        private Long id;

//        @Temporal(TemporalType.TIMESTAMP)
        @CreatedDate
        @Column(name = "Created_Date", nullable = false)
        private LocalDateTime createdTimestamp;

//        @Temporal(TemporalType.TIMESTAMP)
        @LastModifiedDate
        @Column(name = "Last_Modified_Date", nullable = false)
        private LocalDateTime lastUpdateTimestamp;

        public Long getId() {
            return id;
        }

        public LocalDateTime getCreatedTimestamp() {
            return createdTimestamp;
        }
        public LocalDateTime getLastUpdateTimestamp() {
            return lastUpdateTimestamp;
        }
    }
