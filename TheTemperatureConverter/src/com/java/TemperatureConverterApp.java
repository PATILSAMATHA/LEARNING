package com.java;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		 System.out.println("Enter a Temperatutrein Fahrenheit");
		 double f=sc.nextDouble();
		 TemperatureConverter t=new TemperatureConverter();
		 double temp=t.convertFahrenhitToCelsius(f);
		 System.out.println(temp);
	}
	}
