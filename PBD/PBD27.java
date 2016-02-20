import java.util.Scanner;

public class PBD27{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String capital = "Juneau";
		int answer;

		System.out.print("Q1) What is the capital of Alaska?");
		System.out.println("      1) Melbourne");
		System.out.println("      2) Anchorage");
		System.out.println("      3) Juneau");

		answer = keyboard.nextInt();

		if(answer == 3)
		{
			System.out.println("That's right!");
		}
		else
		{
			System.out.println("Wow, that's wrong. Like really wrong.");
		}

	}
}