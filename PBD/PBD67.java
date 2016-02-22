import java.util.Scanner;

public class PBD67
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int countFrom;
		int countTo;
		int countBy;

		System.out.print("Count from: ");
		countFrom = sc.nextInt();
		System.out.print("Count to: ");
		countTo = sc.nextInt();
		System.out.print("Count by: ");
		countBy = sc.nextInt();

		for(int i = countFrom; i <= countTo; i += countBy)
		{
			System.out.print(i + " ");
		}
	}
}