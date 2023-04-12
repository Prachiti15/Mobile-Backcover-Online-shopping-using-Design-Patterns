package TA2;

import java.util.ArrayList;
import java.util.Scanner;
import TA2.Cover.Cover;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoverShop coverShop = new CoverShop();
        int menu = 0;
        while (menu != 2) {
            System.out.println("Press 1 to start shopping.\nPress 2 to exit.");
            menu = Integer.parseInt(sc.nextLine());
            switch (menu) {
                case 1:
                    System.out.println("Enter : ");
                    System.out
                            .println(
                                    "1 for iPhone 10 cover\n2 for iPhone 12 cover\n3 for iPhone SE Cover\n4 To Exit Shopping");
                    int coverType = Integer.parseInt(sc.nextLine());
                    if (coverType == 4) {
                        System.out.println("Thanks for shopping with us. Do visit again...");
                        return;
                    }
                    Cover c = coverShop.basicCover(coverType);
                    System.out.println("Enter the decorations you want on your cover : ");
                    ArrayList<String> decorations = new ArrayList<String>(6);
                    int decoChoice = 0;
                    while (decoChoice != 6) {
                        System.out.println(
                                "1 for Holder\n2 for Own Name\n3 for Own Photo\n4 for Spray Paint\n5 for Stand\n6 for finilizing cover order");
                        decoChoice = Integer.parseInt(sc.nextLine());
                        switch (decoChoice) {
                            case 1:
                                decorations.add("Holder");
                                break;
                            case 2:
                                decorations.add("OwnName");
                                break;
                            case 3:
                                decorations.add("OwnPhoto");
                                break;
                            case 4:
                                decorations.add("SprayPaint");
                                break;
                            case 5:
                                decorations.add("Stand");
                                break;
                            case 6:
                                c = coverShop.addDecoration(decorations, c);
                                break;
                        }
                    }
                    coverShop.coverPayment(c);
                    break;
                case 2:
                    System.out.println("Thanks for shopping with us. Do visit again...");
                    return;
                default:
                    System.out.println("Enter Correct Value");
            }

        }
    }
}