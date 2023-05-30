package gmbh.conteco.SpringSchulungDB30052023.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Database {
    @Autowired
    List<String> names;

    public void printNames() {
        names.forEach(System.out::println);
    }
}
