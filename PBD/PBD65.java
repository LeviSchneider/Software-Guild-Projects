import java.util.Scanner;
import java.util.InputMismatchException;

public class PBD65
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String message;
		int rounds;

		System.out.print("Print a message...");
		message = sc.next();

		System.out.print("How many rounds should be printed?");
		rounds = sc.nextInt();

		for(int i = 1; i <= rounds; i++)
		{
			System.out.println(i + ". " + message);
		}
	}
}