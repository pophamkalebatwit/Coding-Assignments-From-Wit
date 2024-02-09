package tempCompSci;

import java.util.Scanner;
import java.lang.Math;

public class Bmimetric {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter weight in kilograms:");
		double k = input.nextInt();
		System.out.printf("Please enter height in meters:");
		double m = input.nextInt();
		double bmi = k/(Math.pow(m, 2));
		System.out.printf("BMI is:  %.2f", bmi);

	}

}
