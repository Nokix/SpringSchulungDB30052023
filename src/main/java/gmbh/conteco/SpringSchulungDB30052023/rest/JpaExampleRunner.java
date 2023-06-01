package gmbh.conteco.SpringSchulungDB30052023.rest;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Book;
import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.BookRepository;
import gmbh.conteco.SpringSchulungDB30052023.rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaExampleRunner implements CommandLineRunner {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Book book0 = new Book("Analysis 1");
        Book book1 = new Book("Analysis 2");

        Student student0 = new Student("Carlos", book0);
        Student student1 = new Student("Mathias", book1);

        studentRepository.save(student0);
        studentRepository.save(student1);
    }
}
