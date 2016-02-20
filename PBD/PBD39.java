import java.util.Scanner;

public class PBD39
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		String lName;

		System.out.print("What's your last name?");
		lName = sc.next();

		i = lName.compareTo("Jeb");

		if(i < -6)
		{
			System.out.print("You might as well pitch a tent because it's going to be a while.");
		}
		else if(i <= -3)
		{
			System.out.print("Might be a while, have a seat.");
		}
		else
		{
			System.out.print("Were ready for you! Right this way!");
		}
	}
}