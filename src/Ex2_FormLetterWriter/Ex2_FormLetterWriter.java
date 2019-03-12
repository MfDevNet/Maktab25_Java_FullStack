package Ex2_FormLetterWriter;

import java.util.Scanner;

public class Ex2_FormLetterWriter {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String fName=scanner.nextLine();
        System.out.print("Enter Last Name : ");
        String lName=scanner.nextLine();
        System.out.println();
        displaySalutation(fName,lName);
    }

    // method displaySalutation with 1 parameter
    static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }
    // method displaySalutation with 2 parameter and call
    // method displaySalutation with 1
    static void displaySalutation(String firstName, String lastName) {
        //for capital first character first/last name
        lastName = (lastName.substring(0, 1).toUpperCase()) + lastName.substring(1);
        firstName = (firstName.substring(0, 1).toUpperCase()) + firstName.substring(1);
        //call displaySalutation one parameter
        displaySalutation(lastName);
        System.out.println();
        System.out.printf("Greeting Dear %s %s Thank you for \nproviding with a good suggestion for our problem.\nSoon, your solution will be reviewed.", firstName, lastName);
        System.out.println();

    }

}
