package thecoffeecounter;

public class Menu {
    public void showGreetings(){
        System.out.println("Welcome to Cofee Counter");
        System.out.println("Here is our Menu");
        System.out.println("1. Espresso - $10");
        System.out.println("2. Latte - $15");
        System.out.println("3. Cappuccino - $12");
        System.out.println("4. Mocha - $18");
        System.out.println("Type 'exit' to quit.");
    }

    public int getPrice(String coffeeType){
        switch(coffeeType.toLowerCase()){
            case "espresso":
                return 10;
            case "latte":
                return 15;
            case "cappuccino":
                return 12;
            case "mocha":
                return 18;
            default:
                return 0;
        }
    }
}
