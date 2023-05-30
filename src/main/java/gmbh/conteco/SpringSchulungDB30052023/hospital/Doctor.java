package gmbh.conteco.SpringSchulungDB30052023.hospital;

public class Doctor {
    String qualification;
    Nurse nurse;

    public Doctor(String qualification, Nurse nurse) {
        this.qualification = qualification;
        this.nurse = nurse;
    }

    public String assist() {
        return this.qualification + " is helping. "
                + this.nurse.assist();
    }
}
