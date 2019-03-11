//Import classes
import java.util.Scanner;
import java.text.NumberFormat;

public class TemperatureConverter {
	
    public static void main(String args[]) {
    	
        // Display a welcome message
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();

        // Instantiate scanner class
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        
        //Start while loop
         while (choice.equalsIgnoreCase("y")) {
        //Get user input
          System.out.print("Enter degrees in Fahrenheit: ");
          //User input stored in this variable
          double userInput = sc.nextDouble();
          
          double cel = (userInput - 32) * 5/9;
          
          //Use number format to get correct decimal places
          NumberFormat cel2 = NumberFormat.getNumberInstance();
          cel2.setMaximumFractionDigits(2);
          String celFormatted = cel2.format(cel);
          
          System.out.println("Degrees in Celsius: " + celFormatted);
        
          sc.nextLine();

            System.out.println();
            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
         //Close scanner
        sc.close();
        //End program
        System.out.println("End of Temp Converter");
    }
}
