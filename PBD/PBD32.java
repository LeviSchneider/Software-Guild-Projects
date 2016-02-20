import java.util.Scanner;

public class PBD32
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String begin;
		float answer;

		System.out.print("QUIZ TIME! \nAre you a human?");
		begin = keyboard.next();

		if(begin.equals("Yes"))
		{
			System.out.println("That is correct!");
		}
		else
		{
			System.out.println("That is wrong. Like very wrong");
		}
	}
}