package Ex4_TestBloodData;

import java.util.Scanner;

public class TestPatient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // info fix  and call need constructor
        Patient patientWithOneParameters = new Patient(1000);
        Patient patientWithTowParameters = new Patient(1001, 25);
        Patient patientWithThreeParameters = new Patient(1002, 30, "ab+");
        System.out.println("call contractor one parameter");
        patientWithOneParameters.printPatien();
        System.out.println("call contractor tow parameter");
        patientWithTowParameters.printPatien();
        System.out.println("call contractor three parameter");
        patientWithThreeParameters.printPatien();

        //declare array for save Patient info
        Patient[] patient = new Patient[3];
        // loop for get info from user and call need constructor

        for (int i = 0; i < patient.length; i++) {
            System.out.println("---------------");
            System.out.println("Enter BloodData");
            System.out.println("Id :" + 100020 + i);
            System.out.print("Enter Age :");
            int age = scanner.nextInt();
            System.out.print("Enter Blood Type(ab+-,o-+,a+-,b-+):");
            String blooadType = scanner.next();
            patient[i] = new Patient(100020 + i, age, blooadType);
            System.out.println();
        }
        //loop for display patient info
        for (int i = 0; i < patient.length; i++) {
            patient[i].printPatien();
        }
    }
}

