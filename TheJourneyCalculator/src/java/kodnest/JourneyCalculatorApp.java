package java.kodnest;
import java.util.Scanner;

public class JourneyCalculatorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner (System.in);

		System.out.println("Enter Speed And Time To Calculate Distance");

		double speed=scan.nextDouble();

		double time=scan.nextDouble();

		JourneyCalculator journeyCalculator=new JourneyCalculator();

		double distance=journeyCalculator.calculateDistance(speed, time);

		System.out.println(distance);
	}

}
