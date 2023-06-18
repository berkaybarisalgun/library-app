package com.berkaybarisalgun.library.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    //@CreationTimestamp aynı işlevi görüyor=LocalDateTime.now ile.
    private LocalDateTime createDate=LocalDateTime.now();

    @UpdateTimestamp
    private LocalDateTime updateDate;



}
