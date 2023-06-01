package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    private Long id;

    String name;

    public Book(String name) {
        this.name = name;
    }
}
