import java.util.Scanner;

public class PBD33
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String answer;

		System.out.print("WELCOME TO MITCHELL'S TINY ADVENTURE!\n Would you like to go upstairs or into the kitchen?");
		answer = sc.next();

		if(answer.equals("kitchen"))
		{
			System.out.print("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the refrigerator or look in a cabinet.");
			answer = sc.next();

			if(answer.equals("refrigerator"))
			{
				System.out.println("Zombie falls out of the fridge and makes you into a human happy meal!");
			}
			else
			{
				System.out.println("Hide in a cabinet, like a panzi, but you live.");
			}
		}
		else if(answer.equals("upstairs"))
		{
			System.out.print("Upstairs you see a hallway. At the end of the hallway is the master bedroom. There is also a bathroom off the hallway. Where would you like to go?");
			answer = sc.next();

			if(answer.equals("bedroom"))
			{
				System.out.println("Open the door and are killed by a monkey assassin who has a blackbelt in judo.");
			}
			else
			{
				System.out.println("You open the bathroom door and find a winning uncashed lottery ticket. You escape the mansion, and begin investing your winnings into several companies becoming a billionaire! However, your wife (a supermodel) discretely kills you and inherits your fortune with her lover. Careful what you wish for.");
			}
		}
	}
}