package gmbh.conteco.SpringSchulungDB30052023.hospital;

public class Main {
    public static void main(String[] args) {
        String qualification = "Prof. ";
        Doctor doctor = new Doctor(qualification);
        System.out.println(doctor.assist());
    }
}
