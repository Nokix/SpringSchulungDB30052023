package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Book {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    @EqualsAndHashCode.Include
    private Long id;

    String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToMany(mappedBy = "otherBooks", fetch = FetchType.LAZY)
    private List<Student> students = new ArrayList<>();

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, Student student) {
        this.name = name;
        this.student = student;
    }
}
