package joiner.java;

import java.util.Scanner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);

		System.out.println("Enter Your First Name and LastName");

		String firstName=scan.next();

		String lastName=scan.next();

		System.out.println(joinStrings(firstName, lastName));

		}

		public static String joinStrings(String str1, String str2)

		{

		return str1+str2;
	}

}
