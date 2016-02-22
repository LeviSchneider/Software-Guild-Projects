import java.util.Scanner;

public class PBD56
{
	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS";

		double minimumTemperature = 79.0; // degrees Fahrenheit 
		double currentTemperature;//1)Typing in 80.5F Gallant and Goofus swim the same speed.
		double savedTemperature;//2)78F Gallant approaches the lake... stops swimming. Goofus stops swimming after one minute.
		int swimTime;//3 and 4)No Gallant doesn't check the water and Goofus just jumps in.
					//5)While loops ask if there conditions are met in front while do while loops ask at the end.
					//6)The while loop is a pretest loop and the do while loop is a posttest loop.
		System.out.print("What is the current water temperature? ");
		currentTemperature = sc.nextDouble();
		savedTemperature = currentTemperature; //saves a copy of this value so we can get it back later.

		System.out.println("\nOkay, so the current water temperature is " + currentTemperature + "F.");
		System.out.println(swimmer1 + " approaches the lake....");

		swimTime = 0;
		while(currentTemperature >= minimumTemperature)
		{
			System.out.print("\t" + swimmer1 + " swims for a bit.");
			swimTime++;
			System.out.println("Swim time: " + swimTime + " min.");
			Thread.sleep(600);//pause for 600 milliseconds
			currentTemperature -= 0.5;
			System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");
			System.out.println(swimmer2 + " approaches the lake....");
		}
		System.out.println(swimmer1 + " stops swimming. Total swim time: " + swimTime + " min.");

		currentTemperature = savedTemperature;

		System.out.println("\nOkay so the current water temperature is " + currentTemperature + "F.");
		System.out.println(swimmer2 + " approaches the lake....");

		swimTime = 0;
		do
		{
			System.out.println("\t" + swimmer2 + " swims for a bit.");
			swimTime++;
			System.out.println("Swim time: " + swimTime + " min.");
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println("\tThe current water temperature is now " + currentTemperature + "F.");
		
		} while(currentTemperature >= minimumTemperature);
			
		System.out.println(swimmer2 + " stops swimming. Total swim time: " + swimTime + " min.");
	}
}