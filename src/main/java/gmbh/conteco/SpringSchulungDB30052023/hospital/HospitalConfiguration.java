package gmbh.conteco.SpringSchulungDB30052023.hospital;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

import java.util.List;

@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
public class HospitalConfiguration {

    @Bean
    @Profile("!test")
    public String abc() {
        return "Hristina";
    }

    @Bean
    @Profile("test")
    public String def() {
        return "Henrik";
    }



//    @Bean
//    public Doctor getDoctor(@Qualifier("def") String qualification, Nurse nurse) {
//        return new Doctor(qualification, nurse);
//    }
}
