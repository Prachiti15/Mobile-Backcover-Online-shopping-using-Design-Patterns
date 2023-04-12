package TA2.Order;

public class DebitCard extends OrderConfirmationAndPayment {

    @Override
    public double payment(double cost) {
        System.out.println("Payment through DEBIT CARD will cost 2% more bank charges");
        double finalCost = cost + cost * (0.02);
        System.out.println("Payment was through DEBIT CARD.");
        return finalCost;
    }

}
