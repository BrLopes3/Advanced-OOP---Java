package client;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		//create an object scanner to obtain the input from the user
		Scanner scanner = new Scanner(System.in);
		
		//integers to be read by the computer
		int n1, n2, sum;
		
		System.out.print("Enter first integer: ");
		n1 = scanner.nextInt();
		
		System.out.print("Enter second integer: ");
		n2 = scanner.nextInt();
		
		sum = n1+n2;
		System.out.printf("The sum is: %s\n", sum);
		
	}

}
