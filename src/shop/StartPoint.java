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
        System.out.println("2 - Add new item of stock");
        System.out.println("3 - Remove an item of stock");
        System.out.println("4 - Add to stock.");
        System.out.println("5 - Exit our shop.");
        int input = Integer.parseInt(myScanner.nextLine());

        switch (input) {
            case 1:
                addStock();
                viewStock();
                menuOptions();
                break;
            case 2:
                addNewStock();
                menuOptions();
                break;
            case 3:
                removeStock();
                menuOptions();
                break;
            case 4:
                amendStock();
                menuOptions();
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

    private void addNewStock() {
        System.out.println("Please enter the new products details.");
        System.out.println("Stock ID:");
        int productID = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Product Manufacturer:");
        String productManufacturer = new Scanner(System.in).nextLine();
        System.out.println("Product name:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Product price:");
        double productPrice = Double.parseDouble(new Scanner(System.in).nextLine());
        System.out.println("Product quantity:");
        int productQuantity = Integer.parseInt(new Scanner(System.in).nextLine());
        product.add(new Product(name, productID, productManufacturer, productPrice, productQuantity));
    }

    private void removeStock() {
        System.out.println("Please select an item of stock you want to remove:");
        int count = 1;
        for (Product s : product) {
            System.out.println(count + " - " + s.name);
            count++;
            int choice = Integer.parseInt(new Scanner(System.in).nextLine());
            product.remove(choice - 1);
        }
    }

    private void amendStock() {
        System.out.println("Please enter the ID of the product you want to edit");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());
        Product amendStock = null;
        for (Product x : product) {
            if (x.productID == id) {
                amendStock = x;
                break;
            }
        }
        System.out.println("Which field would you like to edit?");
        System.out.println("1 - ID");
        System.out.println("2 - Manufacturer");
        System.out.println("3 - Name");
        System.out.println("4 - Price");
        System.out.println("5 - Stock");
        int choice = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Enter the new details:");
        if (amendStock != null) {
            if (choice == 1) {
                amendStock.productID = Integer.parseInt(new Scanner(System.in).nextLine());
            } else if (choice == 2) {
                amendStock.productManufacturer = new Scanner(System.in).nextLine();
            } else if (choice == 3) {
                amendStock.name = new Scanner(System.in).nextLine();
            } else if (choice == 4) {
                amendStock.productPrice = Double.parseDouble(new Scanner(System.in).nextLine());
            } else if (choice == 5) {
                amendStock.productQuantity = Integer.parseInt(new Scanner(System.in).nextLine());
            } else {
                System.out.println("Please enter a valid option.");
                //amendStock();
                //menuOptions();
            }
        }
    }
}



