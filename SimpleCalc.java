package helloworld;

import java.util.Scanner;

public class SimpleCalc {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x, y;
		System.out.println("Enter a value for x");
		x = scan.nextInt();
		System.out.println("Enter second value");
		y = scan.nextInt();
		System.out.println("Enter the operation you wish to use.");
		String operation = scan.next();
		
		if(operation.equals("+")) {
			System.out.println("This is the addition result: " + (x + y));
		}
		else if(operation.equals("-")) {
			System.out.println("This is the subtraction result: " + (x - y));
		}
		else if(operation.equals("*")) {
			System.out.println("This is the multiplication result: " + (x * y));
		}
		else if(operation.equals("/")) {
			System.out.println("This is the division result: " + (x / y));
		}
		else if(operation.equals("%")) {
			System.out.println("This is the modulis or 'remainder' result: " + (x % y));
		}else
			System.out.println("Error: please enter a valid mathematical operation");
			
	}
}
