import java.util.Scanner;

public class PBD16 {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;
		int pay;

		System.out.print("Hello. What is your name?");
		name = keyboard.nextLine();

		System.out.print("How old are you?");
		age = keyboard.nextInt();

		System.out.print("So you're " + age + " eh? That's not old at all! How much do you make, " + name + "?");
		pay = keyboard.nextInt();
	}
}