package Ex1_encrypt;

import java.util.Scanner;

public class Encrypt {
    public static void main(String[] args) {
        // get message and key from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("This Program Encrypt Message ");
        System.out.print("Enter Message : ");
        String message = scanner.nextLine();
        System.out.print("Enter Key : ");
        int key = scanner.nextInt();

        // create object and call required method for run
        Encryption encryption = new Encryption();
        encryption.getMessage(message);
        encryption.getCode(key);
        System.out.println("encrypt result : "+encryption.encryptAll());

    }

}
