import java.util.Scanner;

public class PBD17 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String fName;
		String lName;
		int grade;
		int id;

		System.out.print("First Name:");
		fName = keyboard.next();

		System.out.print("Last Name:");
		lName = keyboard.next();

		System.out.print("Grade Number:");
		grade = keyboard.nextInt();

		System.out.print("ID Number:");
		id = keyboard.nextInt();

		System.out.println("Your information:");
		System.out.println("         ID: " + id );
		System.out.println(" First Name: " + fName);
		System.out.println("  Last Name: " + lName);
		System.out.println("      Grade: " + grade);
	}
}