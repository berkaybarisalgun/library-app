package com.berkaybarisalgun.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Table(name="category")
@SuperBuilder
@NoArgsConstructor
@Getter
public class Category extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore //bir kategori ekledigimde, o kategoriye kitap eklemek zorunda kalmıyorum.
    private List<Book> books;
}
