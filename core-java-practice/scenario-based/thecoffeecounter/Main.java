package thecoffeecounter;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Menu menu = new Menu();
CoffeeBill bill = new CoffeeBill();

menu.showGreetings();

while(true){
    System.out.println("\\nEnter coffee type (or 'exit' to quit): \"");
    String coffeeType = sc.nextLine();

    if(coffeeType.equalsIgnoreCase("exit")){
        System.out.println("Thank you for visiting The Coffee Counter! ☕");
        break;
    }

    int price = menu.getPrice(coffeeType);
    if(price == 0){
        System.out.println("Invalid coffee type! Please try again");
        continue;
    }
    System.out.println("Enter Quantity: ");
    int quantity = 0;

    try {
        quantity = Integer.parseInt(sc.nextLine());
    } catch(NumberFormatException e) {
        System.out.println("Invalid quantity! Try again.");
        continue;
    }
    double total = bill.calculateBill(price, quantity);
    double totalWithGST = bill.addGST(total);

    System.out.println("Total (without GST): ₹" + total);
    System.out.println("Total (with 18% GST): ₹" + totalWithGST);
}

        sc.close();
}

}
