package gmbh.conteco.SpringSchulungDB30052023.hospital;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
@Setter
@Scope("prototype")
public class Doctor {
    String qualification;
    Nurse nurse;

    public Doctor(@Value("${name}") String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public String assist() {
        return this.qualification + " is helping. "
                + this.nurse.assist();
    }
}
