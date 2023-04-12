package TA2;

import java.util.*;
import TA2.Cover.*;
import TA2.Cover.CoverDecorator.*;
import TA2.Order.*;

public class CoverShop {
    Scanner sc = new Scanner(System.in);

    public Cover basicCover(int model) {
        CoverFactory cf = new CoverFactory();
        Cover c = cf.getCoverModel(model);
        return c;
    }

    public Cover addDecoration(ArrayList<String> decorations, Cover c) {
        for (String s : decorations) {
            if (s.equalsIgnoreCase("Holder")) {
                System.out.println("Added Holder!");
                c = new Holder(c);
            }
            if (s.equalsIgnoreCase("OwnName")) {
                System.out.println("Added Name!");
                c = new OwnName(c);
            }
            if (s.equalsIgnoreCase("SprayPaint")) {
                System.out.println("Added Spray Paint!");
                c = new SprayPaint(c);
            }
            if (s.equalsIgnoreCase("OwnPhoto")) {
                System.out.println("Added Photo!");
                c = new OwnPhoto(c);
            }
            if (s.equalsIgnoreCase("Stand")) {
                System.out.println("Added Stand!");
                c = new Stand(c);
            }
            continue;
        }
        System.out.println("Order completed  for " + c.getDescription());
        System.out.println("Total Cost: Rs " + c.cost());
        return c;
    }

    public void coverPayment(Cover c) {
        OrderConfirmationAndPayment o1 = null;
        System.out.println(
                "Please Confirm the order and proceed with payment.\nPayment options:\n\t1: UPI payment~~ 1.5% bank charges are applicabe\n\t2: Credit card Payment\n\t3:Debit card Payment~~ 2% bank charges are applicabe");
        int pay = Integer.parseInt(sc.nextLine());
        switch (pay) {
            case 1:
                o1 = new UPIPayment();
                o1.placeOrder(c.cost());
                break;
            case 2:
                o1 = new CreditCard();
                o1.placeOrder(c.cost());
                break;
            case 3:
                o1 = new DebitCard();
                o1.placeOrder(c.cost());
                break;
            default:
                break;
        }
    }
}
