import java.util.Random;
import java.util.Scanner;

public class NumberGuessPBD43
{
	public static void main(String[] args)
	{
		Random randomNumber = new Random();
		Scanner sc = new Scanner(System.in);

		int userGuess;
		int consoleNumber;

		System.out.print("I'm thinking of a number form 1 to 10. \n Your guess: ");
		userGuess = sc.nextInt();

		consoleNumber = randomNumber.nextInt(10);

		if(userGuess == consoleNumber)
		{
			System.out.print("That's right! Yay!");
			System.out.print("Your number " + userGuess + "My number " + consoleNumber);
		}
		else
		{
			System.out.print("Not even close! There is no kinda right there is only right! and wrong!");
			System.out.print("Your number " + userGuess + "My number " + consoleNumber);
		}
	}
}