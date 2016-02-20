import java.util.Scanner;

public class PBD26 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int Venus = 1;
		int Mars = 2;
		int weight;
		float gravity = 0;
		int planetOfChoice;

		System.out.print("Please enter your current weight: ");
		weight = keyboard.nextInt();

		System.out.println("I have information for the following planets: (Type the word)");
		System.out.println("1. Venus    2. Mars");

		System.out.print("Which planet are you visiting?");
		planetOfChoice = keyboard.nextInt();

		if(planetOfChoice == Venus)
		{
			gravity = gravity + .78f;
			System.out.println("Your weight would be " + (weight*gravity) + "pounds on that planet.");
		}
		else if(planetOfChoice == Mars)
		{
			gravity = gravity + .39f;
			System.out.println("Your weight would be " + (weight*gravity) + "pounds on that planet.");
		}
		else
		{
			System.out.println("Sorry you don't have enough travel miles to visit there.");
		}
	}
}