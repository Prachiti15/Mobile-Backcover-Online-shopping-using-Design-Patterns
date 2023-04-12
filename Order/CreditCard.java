package TA2.Order;

public class CreditCard extends OrderConfirmationAndPayment {

    @Override
    public double payment(double cost) {
        System.out.println("Payment was through CREDIT CARD.");
        return cost;

    }

}
