package com.java;
import java.util.Scanner;
public class BitwiseCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
System.out.println("Enter a integer value to count bits");
int num=scan.nextInt();
int res=countSetBits(num);
System.out.println(res);
	}
public static int countSetBits (int num) {
	int countSetBits=num;
	int count=0;
	int mask=1; 
	while(num>0) {
		if((num & mask)==1) {
			count++;
		}
		num>>=1;// Right shift to check next bit
	}
	return count;
}
}