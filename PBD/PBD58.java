import java.util.Scanner;
import java.util.Random;

public class PBD58
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int roll1;
		int roll2;
		int sum;
		String decision;

		System.out.print("HERE COME THE DICE!\n");
		System.out.print("\n");

		do
		{
			roll1 = r.nextInt(6)+1;
			roll2 = r.nextInt(6)+1;
			sum = roll1 + roll2;
			System.out.println("\nRoll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			System.out.println("The total is " + sum + "\n");

			System.out.print("Do you want roll again? (y/n)");
			decision = sc.next();
		} while(decision.equals("y"));
	}
}