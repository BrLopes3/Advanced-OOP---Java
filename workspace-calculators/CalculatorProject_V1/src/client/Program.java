package client;
//import java.lang.*;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1) variable declaration
		Scanner scan = new Scanner(System.in);
		int x, y;
		int sum;
		int sub;
		int mul;
		int div;
		int mod;
		
		
		//2) input/output block
		System.out.println("\t\t----Calculator (Version 1)----\n");
		
		System.out.print("input the first integer number: ");
		x = scan.nextInt();
		System.out.print("input the second integer number: ");
		y = scan.nextInt();
		sum = x+y;
		System.out.println(x +" + "+ y +" = "+sum);
		
		sub = x-y;
		System.out.println(x +" - "+ y +" = "+sub);
		
		mul = x*y;
		System.out.println(x +" * "+ y +" = "+mul);
		
		if(y !=0) {
			div = x/y;
			System.out.println(x +" / "+ y +" = "+div);
			
			mod = x%y;
			System.out.println(x +" % "+ y +" = "+mod);
			
		}else {
			System.out.println("Out of range");
		}
		
		
		 
		
		scan.close();

	}

}
