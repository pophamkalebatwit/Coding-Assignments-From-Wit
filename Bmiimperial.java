package tempCompSci;

import java.util.Scanner;
import java.lang.Math;

public class Bmiimperial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Please enter weight in pounds: ", args);
		double lbs = input.nextInt();
		System.out.printf("Please enter height in inches: ", args);
		double in = input.nextInt();
		double k = lbs * 0.453592;
		double m = in * 0.0254;
		double bmi = k/Math.pow(m, 2);
		System.out.printf("BMI is: %.2f", bmi);

	}

}
