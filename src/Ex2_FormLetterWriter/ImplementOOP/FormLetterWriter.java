package Ex2_FormLetterWriter.ImplementOOP;

import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {

    //get info from user
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String fName=scanner.nextLine();
        System.out.print("Enter Last Name : ");
        String lName=scanner.nextLine();
        //create object and call displaySalutation
        displaySalutation dS=new displaySalutation();
        dS.displaySalutation(fName,lName);


    }

}
