import java.util.Scanner;

public class PBD64
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int rounds;
		String message;
		
		System.out.println("Type in a message...");
		System.out.print("Message: ");
		message = sc.next();

		System.out.print("How many rounds should the loop run? ");
		rounds = sc.nextInt() + 1;

		for(int n = 1; n <= rounds; n++)
		{
			System.out.println(n + ". " + message);
		}
	}
}