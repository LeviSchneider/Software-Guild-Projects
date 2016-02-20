import java.util.Scanner;

public class PBD36
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float height;
		float weight;
		float BMI;

		System.out.print("Your height in m: ");
		height = sc.nextFloat();
		System.out.print("Your weight in kg: ");
		weight = sc.nextFloat();

		BMI = (weight / (height * height));

		if(BMI < 18.5)
		{
			System.out.print("You are underweight. Eat something man!");
		}
		else if(BMI < 24.9)
		{
			System.out.print("You are normal weight.");
		}
		else if(BMI < 29)
		{
			System.out.print("You are overweight.");
		}
		else
		{
			System.out.print("You are obese.");
		}
	}
}