import java.util.Random;

public class PBD42_8ball
{
	public static void main(String[] args)
	{
		Random r = new Random();

		int choice = 1 + r.nextInt(5);
		String response = "";

		if (choice == 1)
		{
			response = "It is certain";
		}
		else if(choice == 2)
		{
			response = "It is decidedly so";
		}
		else if(choice == 3)
		{
			response = "Without a doubt";
		}
		else if(choice == 4)
		{
			response = "Yes - definitely";
		}
		else if(choice == 5)
		{
		 	response = "If I told you I would have to kill you...";
		}
		else
		{
			response = "ERROR!!!What have you done!!!";
		}
		System.out.println("MAGIC 8-BALL SAYS: " + response);
	}
}