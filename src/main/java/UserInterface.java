import java.util.Scanner;

public class UserInterface {
    ShoppingList shoppingList = new ShoppingList();
    Scanner sc = new Scanner(System.in);
    private String item;
    private double price;
    private String taxState;
    private String state;
    private int amount;

    public void welcome() {
        System.out.println("Welcome to our store!");
        System.out.println("\u2500".repeat(50));

        System.out.println("Input an item you want to buy: ");
        item = sc.nextLine();
        shoppingList.setItem(item);

        System.out.println("Input the amount of item(s) you want to buy: ");
        amount = sc.nextInt();
        shoppingList.setAmount(amount);

        System.out.println("Input your item(s) price: ");
        price = sc.nextDouble();
        shoppingList.setPrice(price);
        sc.nextLine();

        System.out.println("Input a 2-letter state code to include your tax-rate: ");
        taxState = sc.nextLine().toUpperCase().trim();
        shoppingList.taxRateCalculation(taxState);

        System.out.println("Your total is: " + shoppingList.total() + ", with the tax rate of: " + shoppingList.getTax() + "%" + " and a discount of: " + shoppingList.getDiscount() + "%");
    }
}
