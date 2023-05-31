package gmbh.conteco.SpringSchulungDB30052023.rest.repository;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentListRepo {
    List<Student> database = new ArrayList<>();

    public List<Student> findAll() {
        return database;
    }
}
