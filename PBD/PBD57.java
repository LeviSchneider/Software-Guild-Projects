import java.util.Scanner;
import java.util.Random;

public class PBD57
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		String decision;
		String[] coin = {"HEADS", "TAILS"};
		int flip;

		System.out.print("Would you like to flip a coin? (y/n)");
		decision = sc.next();

		while(decision.equals("y"))
		{
			flip = r.nextInt(2);
			System.out.print("You flip a coin and it is... " + coin[flip]);
			System.out.print("Would you like to flip again (y/n)?");
			decision = sc.next();
		}

		
		do
		{
			flip = r.nextInt(2);
			System.out.print("You flip a coin and it is... " + coin[flip]);
			System.out.print("Would you like to flip again (y/n)?");
			decision = sc.next();
		} while(decision.equals("y"));
	}
}