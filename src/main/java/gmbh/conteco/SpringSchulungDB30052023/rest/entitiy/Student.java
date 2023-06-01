package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Studierende")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include
    Long id;

    @Column(nullable = false)
    @NotBlank(message = "Name should not be blank.")
    String name;

    @ManyToMany
    @JoinTable(name = "studierende_books",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "books_id"))
    private Set<Book> otherBooks = new LinkedHashSet<>();

    @OneToMany(mappedBy = "student",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private Collection<Book> books = new ArrayList<>();

    public void setOtherBooks(Set<Book> otherBooks) {
        this.otherBooks = otherBooks;
    }


    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Collection<Book> books) {
        this.name = name;
        this.books = books;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
