package gmbh.conteco.SpringSchulungDB30052023.rest.service;

import com.github.javafaker.Faker;
import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentListRepo;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class StudentService {
    StudentRepository studentRepo;
    // Wie komme ich an eine Faker instanz ran? (Spring)
    Faker faker;

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student saveStudent(String name) {
        return studentRepo.save(new Student(name));
    }

    public List<Student> createStudents(int amount) {
        return Stream.generate(faker.name()::firstName)
                .limit(amount)
                .map(Student::new)
                .map(studentRepo::save)
                .toList();
    }

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public List<Student> getStudentWithNamePart(String part) {
        return studentRepo.findByNameContains(part);
    }

    public List<String> getStudentNamesWithNamePart(String part) {
        return studentRepo.findNamesByNameContains(part);
    }
}
