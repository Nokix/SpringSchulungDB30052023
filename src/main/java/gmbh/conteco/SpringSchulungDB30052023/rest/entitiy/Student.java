package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Student {
    Long id;

    @NotBlank(message = "Name should not be blank.")
    String name;

    public Student(String name) {
        this.name = name;
    }
}
