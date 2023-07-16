package com.berkaybarisalgun.library.dto;

import com.berkaybarisalgun.library.model.BookStatus;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.springframework.stereotype.Service;

import java.io.File;

@Data
@SuperBuilder
public class BookListItemResponse {
    private Long id;
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private File image;
    private String categoryName;
    private Integer totalPage;
}
