package mate.academy.springbootintrohw01.repository.impl;

import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import mate.academy.springbootintrohw01.exception.DataProcessingException;
import mate.academy.springbootintrohw01.model.Book;
import org.springframework.stereotype.Repository;
import mate.academy.springbootintrohw01.repository.BookRepository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Book save(Book book) {
        try {
            entityManager.persist(book);
            return book;
        } catch (Exception e) {
            throw new DataProcessingException(
                    "Can't add Book to the DB" + book, e);
        }
    }

    @Override
    public List<Book> findAll() {
        try {
            return entityManager
                    .createQuery("FROM Book", Book.class)
                    .getResultList();
        } catch (Exception e) {
            throw new DataProcessingException(
                    "Can't get books from DB", e);
        }
    }
}
