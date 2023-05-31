package gmbh.conteco.SpringSchulungDB30052023.rest.entitiy;

import lombok.*;

@AllArgsConstructor
@Getter
public class Student {
    Long id;
    String name;

    public Student(String name) {
        this.name = name;
    }
}
