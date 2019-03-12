package Ex4_TestBloodData;

public class Patient {
    //declare variable
    private int idNumber;
    private int age;
    private BloodData bloodData = new BloodData();
    //constructor without paramater
    public Patient() {
        this.idNumber = 0;
        this.age = 0;
        this.bloodData.setBloodType("o+");
    }
    //constructor 1 paramater

    public Patient(int idNumber) {
        this.idNumber = idNumber;
    }
    //constructor 2 paramater

    public Patient(int idNumber, int age) {
        this(idNumber);
        this.age = age;
    }

    //constructor 3 paramater

    public Patient(int idNumber, int age, String bloodData) {
        this(idNumber, age);
        this.bloodData.setBloodType(bloodData);
    }

    //method print
    void printPatien() {
        System.out.println("--------------\n" +
                "Patient Info\n" +
                "ID :" + this.idNumber + "\n" +
                "Age :" + this.age + "\n" +
                "BloodType :" + this.bloodData.getBloodType() + "\n");
    }
}
