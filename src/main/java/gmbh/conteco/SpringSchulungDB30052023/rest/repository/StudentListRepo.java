package gmbh.conteco.SpringSchulungDB30052023.rest.repository;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentListRepo {
    List<Student> database = new ArrayList<>();

    public StudentListRepo() {
        database.add(new Student(100L, "Hristana"));
        database.add(new Student(101L, "Jens"));
    }

    public List<Student> findAll() {
        return database;
    }

    public Student save(Student student) {
        database.add(student);
        return student;
    }
}
