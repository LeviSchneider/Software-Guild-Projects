import java.util.Scanner;
import java.util.Random;

public class PBD40
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random randomNumber = new Random();

		int random;
		int guess;

		System.out.print("THE WORST NUMBER GUESSING GAME EVAR!!!");

		random = randomNumber.nextInt(1);
		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. MAKE A GUESS!");
		guess = sc.nextInt();

		if(random == guess)
		{
			System.out.println("You got it congradulations!");
		}
		else
		{
			System.out.println("You weren't even close. You should really go and reevaluate your life.");
		}
	}
}