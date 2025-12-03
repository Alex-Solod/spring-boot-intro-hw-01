package mate.academy.springbootintrohw01.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mate.academy.springbootintrohw01.model.Book;
import org.springframework.stereotype.Repository;
import mate.academy.springbootintrohw01.repository.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book save(Book book) {
        entityManager.persist(book);
        return book;
    }

    @Override
    public List<Book> findAll() {
        return entityManager
                .createQuery("FROM Book", Book.class)
                .getResultList();
    }
}
