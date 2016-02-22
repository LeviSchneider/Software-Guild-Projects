import java.util.Scanner;
import java.util.Random;

public class PBD76
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int firstCardDrawn = 0;
		int secondCardDrawn = 0;
		int playerSum = 0;
		int dealerSum = 0;
		int dealerFaceUp = 0;
		int dealerFaceDown = 0;
		int cardDrawn = 0;

		//Player Draws
		firstCardDrawn = r.nextInt(9) + 2;
		secondCardDrawn = r.nextInt(9) + 2;
		playerSum = firstCardDrawn + secondCardDrawn;
		
		//Dealer Draws
		dealerFaceUp = r.nextInt(9) + 2;
		dealerFaceDown = r.nextInt(9) + 2;
		dealerSum = dealerFaceUp + dealerFaceDown;

		System.out.print("Here are your two cards...\nCard 1: " + firstCardDrawn + " Card 2: " + secondCardDrawn + "\n");

		System.out.print("Here is the dealer's face up card...\nCard 1: " + dealerFaceUp + "\n");

		System.out.print("Do you draw? (y/n)");
		String decision = sc.next();


		while(decision.equals("y"))
		{
			cardDrawn = r.nextInt(9) + 2;
			playerSum += cardDrawn;
			System.out.print("You drew a " + cardDrawn + " leaving you with a total of " + playerSum + "\n");
				
			if(playerSum > 21)
			{
				System.out.print("Sorry your total is over 21 the dealer automatically wins\n");
				decision = "no";
			}
			else
			{
			System.out.print("Does the player want to draw another card? (y/n)");
			decision = sc.next();
			}
		}
		if(playerSum <= 21)
		{
			System.out.print("Does the Dealer want to draw another card? (y/n)");
			decision = sc.next();
			
			while(decision.equals("y"))
			{
				cardDrawn = r.nextInt(9) + 2;
				dealerSum += cardDrawn;
				System.out.print("Dealer drew a " + cardDrawn + " leaving the dealer with a total of  " + dealerSum);

				if(dealerSum > 21)
				{
					System.out.print("You win! The dealer busted!");
					decision = "no";
				}
				else
				{
				System.out.print("Does the dealer want to draw another card? (y/n)");
				decision = sc.next();
				}
			}

			if(playerSum > dealerSum)
			{
				System.out.print("Your sum is " + playerSum + " and the dealers sum is " + dealerSum + ". You win!");
			}
			else if(playerSum == dealerSum)
			{
				System.out.print("Your sum is " + playerSum + " and the dealers sum is " + dealerSum + ". You tied...");
			}
			else
			{
				System.out.print("Your sum is " + playerSum + " and the dealers sum is " + dealerSum + ". You lose...");
			}
		}
		else
		{
			System.out.println("Dealer wins... wah wah waaaaaah.");
		}
	}
}
