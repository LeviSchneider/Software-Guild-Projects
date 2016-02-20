import java.util.Scanner;

public class PBD25{
	public static void main(Stringp[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;

		System.out.print("What's your name?");
		name = keyboard.next();
		System.out.print("Ok, " + name + "how old are you?");
		age = keyboard.nextInt();

		if(age < 16){
			System.out.println("You cannot drive, " + name);
		} else if(age > 16 || age < 18){
			System.out.println("You can't vote, " + name);
			System.out.println("You can't rent a car, " + name);
		} else if(age >= 18 || age < 25){
			System.out.println("You can't rent a car, " + name);
		} else {
			System.out.println("You can do anything legal, " + name);
		}
	}
}