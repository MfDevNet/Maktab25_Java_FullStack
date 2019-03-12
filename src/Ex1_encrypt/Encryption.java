package Ex1_encrypt;

public class Encryption {
    // declare variable
    private String message;
    private int key;

    // declare getCode Method //get code and set this key
    public void getCode(int key) {
        this.key = key;
    }

    //declare getMessage method // get message and set this message
    public void getMessage(String message) {
        this.message = message;
    }

    //declare encrypt method
    //change input char  and  return new char
    private char encrypt(char character) {
        return (char) ((int) character + key);
    }

    //declare encryptAll method
    //change message char by char and no change space
    public String encryptAll() {
        String temp = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                temp += message.charAt(i);
            } else
                temp += encrypt(message.charAt(i));

        }
        return temp;
    }
}
