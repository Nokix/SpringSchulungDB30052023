package gmbh.conteco.SpringSchulungDB30052023.rest.controller;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/students/new/{name}")
    public Student saveStudent(@PathVariable String name){
        System.out.println("Es wurde eingegeben: " + name);
        return studentService.saveStudent(name);
    }


    @PostMapping("/students/create")
    public List<Student> createStudents(
            @RequestParam(value = "n", defaultValue = "5") int amount
    ) {
        return studentService.createStudents(amount);
    }
}
