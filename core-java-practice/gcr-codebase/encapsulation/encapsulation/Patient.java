package encapsulation;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        patientId = id;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + ", Age: " + age);
    }
}
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}
class InPatient extends Patient implements MedicalRecord {
    private String record;

    public InPatient(int id, String name, int age) {
        super(id, name, age);
    }

    public double calculateBill() {
        return 5000;
    }

    public void addRecord(String r) {
        record = r;
    }

    public void viewRecords() {
        System.out.println(record);
    }
}
