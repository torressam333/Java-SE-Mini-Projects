import java.util.Scanner;
public class StudentHeight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numStudents;
		
		double [] height;
		
		System.out.println("How many students are in the class?");
		numStudents = sc.nextInt();
		//Instantiate the array
		height = new double[numStudents];
		
		//Loop through student heights
		for(int i = 0; i <numStudents; i++) {
			System.out.println("Enter the student's heights in inches: ");
			height[i] = sc.nextDouble();
		}
		
		double maxHeight = height[0];
		
		for(int i = 1; i < height.length; i++) {
			if(maxHeight < height[i]) {
				maxHeight = height[i];
			}
		}//End 2nd for loop
		
		double total = 0;
		
		for(int i = 0; i < height.length; i++) {
			total += height[i];
		}//End 3rd for loop
		System.out.println("The tallest student height in the class is " + maxHeight + " inches tall");
		System.out.println("The average height of all students is: " + (total/numStudents) + " inches tall");
	}
}
