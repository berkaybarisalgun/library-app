package com.berkaybarisalgun.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="cat")
@Data
public class Category extends {

    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore //bir kategori ekledigimde, o kategoriye kitap eklemek zorunda kalmıyorum.
    private List<Book> books;
}
