package com.berkaybarisalgun.service;

import com.berkaybarisalgun.library.dto.BookResponse;
import com.berkaybarisalgun.repository.BookRepository;
import com.berkaybarisalgun.repository.CategoryRepository;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookListService {
    private CategoryRepository categoryRepository;
    private BookRepository bookRepository;

    public List<BookResponse> listBook(BookSearchRequest searchRequest){
        bookRepository.findAll(PageRequest.of(searchRequest.getPage(),,searchRequest.getSize()))
                .getContent()
                .stream()
                .map(model->{
                    BookResponse.builder()
                            .bookStatus(model.getBookStatus())
                            .authorName(model.getAuthorName())
                            .categoryId(model.getCategory().getId())
                            .title(model.getTitle())
                            .lastPageNumber(model.getLastPageNumber())
                            .totalPage(model.getTotalPage())
                            .build();
                })
    }
}
