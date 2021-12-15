package shop;

import java.util.ArrayList;
import java.util.Scanner;

public class StartPoint {

    Scanner myScanner = new Scanner(System.in);
    ArrayList<Product> product = new ArrayList<>();

    public static void main(String[] args) {


        StartPoint stock = new StartPoint();
        stock.menuOptions();
       // stock.addStock();
        //stock.viewStock();
    }

    public void menuOptions() {
        System.out.println("Welcome to the Muay Thai online shop..");
        System.out.println("Ready to be a worldclass fighter?");
        System.out.println("Please choose an option from below :)");
        System.out.println(" ------------------------------------");
        System.out.println("1 - View stock items");
        System.out.println("2 - Exit our shop.");
        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                addStock();
                viewStock();
                menuOptions();
                break;
        }
    }

    public void addStock() {
        product.add(new Product("Leather boxing gloves", 190, "Phoenix", 50, 26));
        product.add(new Product("Muay Thai shorts", 198, "Phoenix", 27, 15));
        product.add(new Product("Muay Thai t-shirt", 200, "Phoenix", 19, 23));
        product.add(new Product("Weighted Skipping rope", 221, "Phoenix", 8, 34));
    }

    public void viewStock() {
        System.out.println("The items we stock include:");
        System.out.println("----------------------------------------");
        for (Product i : product) {
            System.out.println("Name: " + i.name + ", Price: £" + i.productPrice +
                    ", Manufacturer: " + i.productManufacturer + ", Product ID: " + i.productID + ", Number in Stock: " + i.productQuantity);
            System.out.println("---------------------------------------------------------------------------------------");
        }
    }
}

