import java.util.Scanner;

public class PBD50
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Type in a message, and I'll display it five times.");
		System.out.print("Message: ");
		String message = sc.nextLine();

		System.out.print("How many times do we repeat the message?");
		int messageRepeat = sc.nextInt();
		int n = 0;
		while(n < messageRepeat)
		{
			System.out.println((n + 1) + ". " + message);
			n++;
		}
	}
}