package helloworld;

import java.util.Scanner;

public class ItemsCost {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double [] prices = new double[5];
		System.out.println("Enter 5 different items values");
		prices[0] = scan.nextDouble();
		prices[1] = scan.nextDouble();
		prices[2] = scan.nextDouble();
		prices[3] = scan.nextDouble();
		prices[4] = scan.nextDouble();
		double total = prices[0] + prices[1] + prices[2] + prices[3] + prices[4];
		
		System.out.printf("The total values of all 5 items is: $%5.2f", total);
	}
}
