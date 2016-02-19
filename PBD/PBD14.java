import java.util.Scanner;

public class PBD14 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String height;

		System.out.print("How old are you?");
		age = keyboard.nextInt();

		System.out.print("How tall are you?");
		height = keyboard.next();

		System.out.println("So you're " + age + " old, " + height + " tall.");
	}
}