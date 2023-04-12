package TA2.Order;

import java.util.Scanner;

public abstract class OrderConfirmationAndPayment {
    public String doConfirm;

    public void isChosen() {
        System.out.println("The backcover is in the cart");

    }

    public abstract double payment(double cost);

    public final boolean confirm(String doConfirm) {
        if (doConfirm.equalsIgnoreCase("YES")) {
            try {
                System.out.println("Order has been CONFIRMED!\n");
                return true;
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        } else {
            try {
                System.out.println("Order has been CANCELLED!\nThankyou");
                return false;
            } catch (Exception e) {
                System.out.println("ERROR");
            }
        }
        return false;
    }

    public void delivery() {
        System.out.println(
                "The backcover will be delivered in 5-7 working days... \nOur delivery partner will contact you if needed.\nThankyou for choosing us!");
    }

    public final void placeOrder(double cost) {
        isChosen();
        double finalCost = payment(cost);
        System.out.println("The final cost is : " + finalCost);
        System.out.println("\nKindly type YES to place the order or NO to discard");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        boolean flag = confirm(ans);
        if (flag)
            delivery();
    }

}