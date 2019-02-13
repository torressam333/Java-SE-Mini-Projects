package helloworld;
import java.util.Scanner;

public class FindAverage {
	
	public static void main(String[] args) {
		double x, y, z;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 numbers to get the average: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
		
		avg = (x + y + z)/3;
		System.out.println("The average is = " + avg);
	}	
	
	public static double average(double num1, double num2, double num3) {
		double avg = (num1 + num2 + num3) / (3);
		return avg;
	}
}