package mate.academy.springbootintrohw01.service;

import java.util.List;
import mate.academy.springbootintrohw01.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
