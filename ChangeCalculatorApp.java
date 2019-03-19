/*****************************************
File: ChangeCalculator.java;
Purpose: The purpose of this project is to distribute and display a users correct change 
using the correct minimum amount of US currency coins in combination, 
i.e. quarters, dimes, nickels and pennies when they enter an integer from 0 - 99 cents.
Author: Samuel Torres
****************************************/
import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Change Calculator");
        System.out.println();

        // create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Set initial coin values
        int quarter = 25;  
        int dime = 10;  
        int nickel = 5;  
        int penny = 1;  
        
        // Run through the loop of calculations while user choice is equal to "y" or "Y"
        String choice = "y";
        
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter number of cents (0-99):  ");
            
            //Get next integer entered
            int userChange = sc.nextInt();
            
            //Change back calculations using division and modulus to get remainder
            int totalQuarters = (userChange / quarter); 
            userChange %= quarter;
    		int totalDimes = (userChange / dime);
    		userChange %= dime;
    		int totalNickels = (userChange / nickel);
    		userChange %= nickel;
    		int totalPennies = (userChange / penny);
    		userChange %= penny;
    		
    		//Line break
    		System.out.println();
    		//Print out the correct coin amounts for change owed back
    		System.out.println("Quarters: " + totalQuarters);
    		System.out.println("Dimes:    " + totalDimes);
    		System.out.println("Nickels:  " + totalNickels);
    		System.out.println("Pennies:  " +totalPennies);
    		
    		//Scan next line
            sc.nextLine();
            //line break
            System.out.println();
            // Ask use they want to continue
            System.out.print("Continue? (y/n): ");
            //Users choice
            choice = sc.nextLine();
            System.out.println();
        }
        //Close scanner object
        sc.close();
        System.out.println("End of Assignment 4");
    }
}