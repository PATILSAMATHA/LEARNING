package com.java;
import java.util.Scanner;
public class TaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter purchase amount and tax rate");
double PA = scan.nextDouble();
double TR = scan.nextDouble();
double purchaseamount=add(PA,TR);
System.out.println(purchaseamount);
	}

 private static double add(double PA, double TR) {
		// TODO Auto-generated method stub
	 double  purchaseamount= PA*TR+PA;
		return purchaseamount;

	}
}

