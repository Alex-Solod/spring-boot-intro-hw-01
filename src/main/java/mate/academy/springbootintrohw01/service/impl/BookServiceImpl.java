package mate.academy.springbootintrohw01.service.impl;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.springbootintrohw01.model.Book;
import org.springframework.stereotype.Service;
import mate.academy.springbootintrohw01.repository.BookRepository;
import mate.academy.springbootintrohw01.service.BookService;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
