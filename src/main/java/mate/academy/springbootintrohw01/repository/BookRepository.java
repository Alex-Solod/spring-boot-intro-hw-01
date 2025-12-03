package mate.academy.springbootintrohw01.repository;

import java.util.List;
import mate.academy.springbootintrohw01.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
