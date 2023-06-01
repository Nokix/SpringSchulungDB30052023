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

    public Student(String name) {
        this.name = name;
    }
}
