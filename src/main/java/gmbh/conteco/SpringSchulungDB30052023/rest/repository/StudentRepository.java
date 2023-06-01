package gmbh.conteco.SpringSchulungDB30052023.rest.repository;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}