package programmingmarathon;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("Enter 2 numbers ");

		long num1=scan.nextLong();

		long num2=scan.nextLong();

		System.out.println(galacticAddition(num1, num2));

		}

		public static long galacticAddition(long num1, long num2){

		return num1+num2;
	}

}
