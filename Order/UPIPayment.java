package TA2.Order;

public class UPIPayment extends OrderConfirmationAndPayment {

    @Override
    public double payment(double cost) {
        System.out.println("Payment through UPI will cost 1.5% more bank charges");
        double finalCost = cost + cost * (0.015);
        System.out.println("Payment was through UPI.");
        return finalCost;
    }

}
