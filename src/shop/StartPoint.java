package shop;

import java.util.Scanner;

public class StartPoint {

    public static void main(String[] args) {
        StartPoint stock = new StartPoint();
        stock.menuOptions();
    }
    Scanner myScanner = new Scanner(System.in);

    public void menuOptions (){
        System.out.println("Welcome to the Muay Thai online shop..");
        System.out.println("Ready to be a worldclass fighter?");
        System.out.println("Please choose an option from below :)");
        System.out.println(" ------------------------------------");
        System.out.println("1 - View stock items");
        System.out.println("2 - Exit our shop.");
    }
}
