package com.berkaybarisalgun.library.dto;

import com.berkaybarisalgun.library.model.BookStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.File;

@Data
public final class SaveBookRequest {

    @NotBlank
    private String title;
    @NotBlank
    private String authorName;
    @NotNull
    private BookStatus bookStatus;
    @NotBlank
    private String publisher;
    @NotNull
    private Integer lastPageNumber;

    private File image;
    @NotNull
    private Long categoryId;
    @NotNull
    private Integer totalPage;
}
