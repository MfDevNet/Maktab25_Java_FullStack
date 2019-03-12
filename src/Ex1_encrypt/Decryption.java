package Ex1_encrypt;

public class Decryption {
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

    //declare deCrypt method
    //change input char  and  return new char
    private char deCrypt(char character) {
        return (char) ((int) character - key);
    }

    //declare deCryptAll method
    //change message char by char and no change space // back to original message
    public String deCryptAll() {
        String temp = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                temp += message.charAt(i);
            } else
                temp += deCrypt(message.charAt(i));

        }
        return temp;
    }
}
