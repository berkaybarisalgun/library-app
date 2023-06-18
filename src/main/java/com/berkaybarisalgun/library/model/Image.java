package com.berkaybarisalgun.library.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name="images")
@Getter
@SuperBuilder
@NoArgsConstructor
public class Image extends BaseEntity {
    public String imageUrl;



}
