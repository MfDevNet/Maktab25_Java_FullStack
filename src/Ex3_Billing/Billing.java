package Ex3_Billing;

public class Billing {

    public static void main(String[] args) {
        //declare variable
        int photoBookPrice = 100;
        int photoBookQuantity = 5;
        int photoBookCoupon = 20;

        // if price is valid  and quantity Coupon is zero  call computeBill by 1 parameter
        System.out.println("Call method one parameter(Price ony)");
        System.out.println("photoBook Price = " + computeBill(photoBookPrice));


        // if price  and quantity is valid  Coupon is zero  call computeBill by 2 parameter

        System.out.println("Call method tow parameter(Price and Quantity)");
        System.out.println("photoBook Price = " + computeBill(photoBookPrice, photoBookQuantity));

        // if price  and quantity and coupon is valid call computeBill by 3 parameter
        System.out.println("Call method three parameter(Price and Quantity and Coupon)");
        System.out.println("photoBook Price = " + computeBill(photoBookPrice, photoBookQuantity, photoBookCoupon));

    }

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
