package Ex4_TestBloodData;

public class BloodData {

    // declare variable
    private String bloodType = null;
    private String rhFactor = null;

    //constructor without parameter
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    //constructor 1 parameter
    public BloodData(String bloodType) {
        validationBloodData(bloodType);
    }

    public String getBloodType() {
        return (this.bloodType + " " + this.rhFactor).toUpperCase();
    }

    public void setBloodType(String bloodType) {
        validationBloodData(bloodType);
    }

    //method for input validationBloodData
    private void validationBloodData(String bloodType) {
        if (bloodType.startsWith("AB") || bloodType.startsWith("ab")) {
            this.bloodType = "AB";
            this.rhFactor = "" + bloodType.charAt(2);

        } else if (bloodType.endsWith("ab") || bloodType.endsWith("AB")) {
            this.bloodType = "AB";
            this.rhFactor = "" + bloodType.charAt(0);
        } else if (bloodType.charAt(0) == 45 || bloodType.charAt(0) == 43) {
            this.bloodType = "" + bloodType.charAt(1);
            this.rhFactor = "" + bloodType.charAt(0);
        } else {
            this.bloodType = "" + bloodType.charAt(0);
            this.rhFactor = "" + bloodType.charAt(1);
        }

    }
}
