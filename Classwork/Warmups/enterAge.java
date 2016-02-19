import java.util.Scanner;

public class enterAge{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print("Please print your age.");
		age = keyboard.nextInt();

		if(age < 18){
			System.out.println("You should be in school!");
		} else if(age > 18 && age < 65){
			System.out.println("Time to go to work.");	
		} else{
			System.out.println("Enjoy retirement!");
		}
	}
}