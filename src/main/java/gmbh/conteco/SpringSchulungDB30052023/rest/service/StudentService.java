package gmbh.conteco.SpringSchulungDB30052023.rest.service;

import com.github.javafaker.Faker;
import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentListRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class StudentService {
    StudentListRepo studentListRepo;
    // Wie komme ich an eine Faker instanz ran? (Spring)
    Faker faker;

    public List<Student> getAllStudents() {
        return studentListRepo.findAll();
    }

    public Student saveStudent(String name) {
        return studentListRepo.save(new Student(name));
    }

    public List<Student> createStudents(int amount) {
        return Stream.generate(faker.name()::firstName)
                .limit(amount)
                .map(Student::new)
                .map(studentListRepo::save)
                .toList();
    }
}
