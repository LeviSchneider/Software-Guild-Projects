import java.util.Scanner;

public class PBD66
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int counter;

		System.out.print("Count to: ");
		counter = sc.nextInt();

		for(int i = 1; i <= counter; i++)
		{
			System.out.print(i + " ");
		}
	}
}