import java.util.Scanner;

public class PBD19{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		float first;
		float second;
		float third;

		System.out.print("What is your first number?");
		first = keyboard.nextFloat();
		System.out.print("What is your second number?");
		second = keyboard.nextFloat();
		System.out.print("What is your third number?");
		third = keyboard.nextFloat();

		
		System.out.println("( " + first + " + " + second + " + " + third +  " ) / 2 is... " + ((first+second+third)/2)); 	
	}
}