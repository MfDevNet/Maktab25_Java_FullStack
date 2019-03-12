package Ex2_FormLetterWriter.ImplementOOP;

public class displaySalutation {
    // constructor displaySalutation with 1 parameter
    public void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
    }

    // constructor displaySalutation with 2 parameter and call constructor displaySalutation with 1
    public void displaySalutation(String firstName, String lastName) {
        //for capital first character first/last name
        lastName = (lastName.substring(0, 1).toUpperCase()) + lastName.substring(1);
        firstName = (firstName.substring(0, 1).toUpperCase()) + firstName.substring(1);
        //call displaySalutation one parameter
        this.displaySalutation(lastName);
        System.out.printf("Greeting Dear %s %s Thank you for \nproviding with a good suggestion for our problem.\nSoon, your solution will be reviewed.", firstName, lastName);

    }
}
