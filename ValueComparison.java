package helloworld;

import java.util.Scanner;

public class ValueComparison {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x,y;
		System.out.println("Enter a value for x");
		x = scan.nextDouble();
		System.out.println("Enter a value for y");
		y = scan.nextDouble();
		
		if(x > y) {
			System.out.println("x is greater in value than y");
		}
		else if(x == y) {
			System.out.println("x and y are equal in value");
		}
		else {
			System.out.println("y is greater in value than x");
		}
		
	  }
}
