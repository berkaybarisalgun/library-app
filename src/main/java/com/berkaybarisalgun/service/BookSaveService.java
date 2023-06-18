package com.berkaybarisalgun.service;

import com.berkaybarisalgun.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookSaveService {
    private final BookRepository bookRepository;
    
}
