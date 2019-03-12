package Ex1_encrypt;

import java.util.Scanner;

public class StaticEncrypt {
    public static void main(String[] args) {
        // get message and key from user
    Scanner scanner = new Scanner(System.in);
        System.out.println("This Program Encrypt Message ");
        System.out.print("Enter Message : ");
    String message = scanner.nextLine();
        System.out.print("Enter Key : ");
    int key = scanner.nextInt();
     // call encryptAll static from class StaticEncryption
        System.out.println("encrypt result : " + StaticEncryption.encryptAll(message, key));

    }
}
