package Ex1_encrypt;

public class StaticEncryption {
    //declare encrypt method
    //change input char  and  return new char
    private static char encrypt(char character, int key) {
        return (char) ((int) character + key);
    }

    //declare encryptAll method
    //change message char by char and no change space
    public static String encryptAll(String message , int key) {
        String temp = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                temp += message.charAt(i);
            } else
                temp += encrypt(message.charAt(i),key);

        }
        return temp;
    }
}
