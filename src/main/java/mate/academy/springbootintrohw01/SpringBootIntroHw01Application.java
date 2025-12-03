package mate.academy.springbootintrohw01;

import java.math.BigDecimal;
import mate.academy.springbootintrohw01.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import mate.academy.springbootintrohw01.service.BookService;

@SpringBootApplication
public class SpringBootIntroHw01Application {

    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootIntroHw01Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("Java");
            book.setAuthor("Mate");
            book.setIsbn("123");
            book.setPrice(BigDecimal.valueOf(100));
            book.setDescription("Java Book");

            Book saved = bookService.save(book);
            System.out.println(saved);

            bookService.findAll()
                    .forEach(b -> System.out.println(b.getTitle()
                            + " " + b.getAuthor()));
        };
    }
}
