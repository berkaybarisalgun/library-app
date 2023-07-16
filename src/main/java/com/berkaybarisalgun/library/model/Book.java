package com.berkaybarisalgun.library.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name="book")
@Getter
@NoArgsConstructor
@SuperBuilder
public class Book extends BaseEntity{

    private String title;
    private String authorName;

    @Enumerated(value = EnumType.STRING)
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    @OneToOne
    private Image image;
    private Integer totalPage;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    private Long userId;

}
