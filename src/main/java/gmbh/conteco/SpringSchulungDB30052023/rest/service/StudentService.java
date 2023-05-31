package gmbh.conteco.SpringSchulungDB30052023.rest.service;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentListRepo studentListRepo;

    public List<Student> getAllStudents() {
        return studentListRepo.findAll();
    }
}
