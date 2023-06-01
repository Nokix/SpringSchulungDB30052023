package gmbh.conteco.SpringSchulungDB30052023.rest.controller;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.service.StudentService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{part}")
    public List<Student> getStudentsWithNamePart(@PathVariable String part) {
        return studentService.getStudentWithNamePart(part);
    }

    @GetMapping("/students/names/{part}")
    public List<String> getStudentNamesWithNamePart(@PathVariable String part) {
        return studentService.getStudentNamesWithNamePart(part);
    }

    @PostMapping("/students/new/{name}")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@PathVariable String name){
        System.out.println("Es wurde eingegeben: " + name);
        return studentService.saveStudent(name);
    }


    @PostMapping("/students/create")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Student> createStudents(
            @RequestParam(value = "n", defaultValue = "5") int amount
    ) {
        return studentService.createStudents(amount);
    }

    @PostMapping(value = "/students/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@Valid @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ObjectError> handleValidationException(
            MethodArgumentNotValidException ex
    ){
        return ex.getBindingResult().getAllErrors();
    }
}
