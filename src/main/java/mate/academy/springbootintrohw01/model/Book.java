package mate.academy.springbootintrohw01.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import lombok.Data;

@Entity
@Data
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String author;

    @Column(unique = true)
    private String title;

    @Column(unique = true)
    private String isbn;

    @Column(unique = true)
    private BigDecimal price;

    @Column(unique = true)
    private String description;
}
