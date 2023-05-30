package gmbh.conteco.SpringSchulungDB30052023.hospital;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Doctor {
    @Value("Lisa")
    String qualification;

    @Autowired
    Nurse nurse;

//    public Doctor(String qualification, Nurse nurse) {
//        this.qualification = qualification;
//        this.nurse = nurse;
//    }


    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public String assist() {
        return this.qualification + " is helping. "
                + this.nurse.assist();
    }
}
