package gmbh.conteco.SpringSchulungDB30052023.rest.repository;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByNameContains(String name);

    @Query("SELECT s.name FROM Student s WHERE s.name LIKE %?1%")
    List<String> findNamesByNameContains(String name);

    @Query("select s from Student s where s.name like concat(?1, '%') and s.id < ?2")
    Optional<Student> findByNameStartsWithAndIdLessThan(String name, Long id);
}