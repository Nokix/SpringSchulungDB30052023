package gmbh.conteco.SpringSchulungDB30052023.hospital;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(HospitalConfiguration.class);

//        Database database = context.getBean(Database.class);
//        database.printNames();

        Doctor doctor = context.getBean(Doctor.class);
        doctor.setQualification("Gael");
        System.out.println(doctor.assist());
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1.assist());



//        System.out.println("\nBeans in Application Context:");
//        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

    }
}
