import java.util.Scanner;

public class PBD37
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String fName;
		String lName;
		String gender;
		String marriage;

		int age;


		System.out.print("What is your gender (M or F)");
		gender = sc.next();
		System.out.print("What is your first name? ");
		fName = sc.next();
		System.out.print("What is your last name? ");
		lName = sc.next();
		System.out.print("How old are you?");
		age = sc.nextInt();
		System.out.print("Are you married, (yes or no) " + fName + " " + lName + "?");
		marriage = sc.next();
		
		if(marriage.equals("yes") && gender.equals("M"))
		{
			System.out.print("Then I shall call you Mr." + lName);
		}
		else if(marriage.equals("yes") && gender.equals("F"))
		{
			System.out.print("Then I shall call you Mrs." + lName);
		}
		else if(marriage.equals("no") && gender.equals("M"))
		{
			System.out.print("Then I shall call you Mr." + lName);
		}
		else
		{
			System.out.print("Then I shall call you Ms." + lName);
		}
	}
}