import java.util.Scanner;

public class PBD34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int age = 0;

		System.out.print("Your name: ");
		name = sc.next();

		System.out.print("Your age: ");
		age = sc.nextInt();


		if(age < 16)
		{
			System.out.print("You can't drive, " + name + ".");
		}
		else if(age < 18)
		{
			System.out.print("You can drive but you can't vote, " + name + ".");
		}
		else if(age < 25)
		{
			System.out.print("You can vote but not rent a car. " + name + ".");
		}
		else if(age > 25)
		{
			System.out.print("You can do pretty much anything " + name + ".");
		}

	}
}