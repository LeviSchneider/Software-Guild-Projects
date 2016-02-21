import java.util.Random;
import java.util.Scanner;

public class PBD44
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int lucky1;
		int lucky2;
		int lucky3;
		int lucky4;
		int lucky5;
		int lucky6;
		int message;
		String fortune = "";
		String decision;
		
		System.out.println("Should you open a fortune cookie?");
		decision = sc.next();

		while(decision.equals("Yes"))
		{
		message = r.nextInt(4);

		if(message == 0)
		{
			fortune = "You will find true love, or eat your sadness away into obesity.";
		}
		else if(message == 1)
		{
			fortune = "You will make a name for yourself! Trust me it will involve aclohol!";
		}
		else if(message == 2)
		{
			fortune = "Drive will make you go great distance, but will wear tires. That's why should buy Firestone tires.\n That way you are successful without recourse!";
		}
		else if(message == 3)
		{
			fortune = "The squeaky wheel gets the grease, but the quacking duck gets shot. Don't be duck, be a wheel.";
		}
		else if(message == 4)
		{
			fortune = "You're going to die! Not today mind you...        but eventually :(";
		}

		if(decision.equals("Yes"))
		{
			lucky1 = r.nextInt(54);
			lucky2 = r.nextInt(54);
			lucky3 = r.nextInt(54);
			lucky4 = r.nextInt(54);
			lucky5 = r.nextInt(54);
			lucky6 = r.nextInt(54);

			System.out.print("Fortune cookie says: " + fortune);
			System.out.println(lucky1 + " - " + lucky2 + " - " + lucky3 + " - " + lucky4 + " - " + lucky5 + " - " + lucky6); 
		}
		System.out.print("Would you like to open another one?");
		decision = sc.next();
		}
	}
}