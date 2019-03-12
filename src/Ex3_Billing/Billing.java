package Ex3_Billing;

public class Billing {

    // static method computeBill overloaded

    static int computeBill(int price) {
        return (price * 8 / 100) + price;
    }

    static int computeBill(int price, int quantity) {
        return computeBill(price) * quantity;
    }

    static int computeBill(int price, int quantity, int coupon) {
        return computeBill(price, quantity) - coupon;
    }
}
