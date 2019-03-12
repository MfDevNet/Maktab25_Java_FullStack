package Ex4_TestBloodData;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {

        // for test class BloodType
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Blood Type Example(O-+),(AB-+),(A-+)(B-+) : ");
        String getBloodType = scanner.nextLine();
        BloodData bloodData = new BloodData(getBloodType);
        System.out.println("BloodType Is " + bloodData.getBloodType());



    }
}
