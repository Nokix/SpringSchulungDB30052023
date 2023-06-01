package gmbh.conteco.SpringSchulungDB30052023.rest;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Book;
import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.BookRepository;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class JpaExampleRunner implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Student student0 = new Student("Carlos");
        Student student1 = new Student("Mathias");

        Book book0 = new Book("Analysis 1", student0);
        Book book1 = new Book("Analysis 2", student0);
        Book book2 = new Book("Analysis 3", student1);

        bookRepository.saveAll(List.of(book0, book1, book2));
//        studentRepository.save(student0);
//        studentRepository.save(student1);

        Optional<Student> student = studentRepository.findById(1L);
    }
}
