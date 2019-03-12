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

    }
}

