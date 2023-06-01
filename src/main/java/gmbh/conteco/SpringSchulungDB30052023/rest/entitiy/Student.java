package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@Table(name = "Studierende")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class Student {
    @Id
    @GeneratedValue
    Long id;

    @Column(nullable = false)
    @NotBlank(message = "Name should not be blank.")
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    Book book;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
