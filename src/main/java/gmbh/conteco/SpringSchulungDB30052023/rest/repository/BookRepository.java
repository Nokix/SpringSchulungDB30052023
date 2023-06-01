package gmbh.conteco.SpringSchulungDB30052023.rest.repository;

import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}