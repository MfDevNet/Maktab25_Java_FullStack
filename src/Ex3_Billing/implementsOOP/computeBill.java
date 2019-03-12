package Ex3_Billing.implementsOOP;

public class computeBill {
    private static int price;
    //return price
    public static int getPrice() {
        return price;
    }

    // constructor computeBill overloaded

    public computeBill(int price) {
        computeBill.price = (price *8 / 100) + price;
    }

    public computeBill(int price, int quantity) {
        this(price);
        computeBill.price = computeBill.price * quantity;
    }

    public computeBill(int price, int quantity, int coupon) {
        this(price, quantity);
        computeBill.price = computeBill.price - coupon;
    }
}
