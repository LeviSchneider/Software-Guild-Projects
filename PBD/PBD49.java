import java.util.Scanner;
import java.util.Random;

public class PBD49
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int computerNumber;
		int userGuess;

		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		userGuess = sc.nextInt();

		computerNumber = r.nextInt(10);

		while(userGuess != computerNumber)
		{
			System.out.println("Your guess: " + userGuess);
			System.out.println("That is incorrect. Guess again.");
			userGuess = sc.nextInt();
			if(userGuess == computerNumber)
			{
				System.out.println("Your guess: " + userGuess);
				System.out.println("That's right! You're a good guesser.");
				break;
			}
		}
	}
}