package gmbh.conteco.SpringSchulungDB30052023.hospital;

public class Doctor {
    String qualification;

    public Doctor(String qualification) {
        this.qualification = qualification;
    }

    public String assist() {
        return this.qualification + " is helping.";
    }
}
