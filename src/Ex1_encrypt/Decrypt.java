package Ex1_encrypt;

import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        // get message and key from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Program Decrypt Message ");
        System.out.print("Enter Message(encrypt) : ");
        String message = scanner.nextLine();
        System.out.print("Enter Key : ");
        int key = scanner.nextInt();
        // create object and call required method for run
        Decryption decryption = new Decryption();
        decryption.getMessage(message);
        decryption.getCode(key);
        System.out.println("decrypt result : "+decryption.deCryptAll());


    }

}
