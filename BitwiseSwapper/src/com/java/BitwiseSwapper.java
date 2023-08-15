package com.java;
import java.util.Scanner;
public class BitwiseSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter two integer values for the bitwise swapping operation");
int a=scan.nextInt();
int b=scan.nextInt();
swapUsingBitwise(a,b);
	}
private static void swapUsingBitwise (int a,int b) {
	// TODO Auto-generated method stub
	  a=a^b;
    b=a^b;
     a=a^b;
     System.out.println("Swapped values is" +a+ " " +b);
	}
}