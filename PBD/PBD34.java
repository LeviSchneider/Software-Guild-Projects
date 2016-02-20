import java.util.Scanner;

public class PBD34
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String answer;
		String answer2;

		System.out.println("Think of something and I'll try to guess it!");

		System.out.print("Question 1) Does it stay inside or outside or both? ");
		answer = sc.next();

		System.out.print("Question 2) Is it a living thing?");
		answer2 = sc.next();

		if(answer.equals("outside"))
		{
			if(answer2.equals("yes"))
			{
				System.out.print("I don't know an eagle donkey lobster");
			}
			else
			{
				System.out.print("No idea, pizza delivery truck!?");
			}
		}
		else if(answer.equals("inside"))
		{
			if(answer2.equals("yes"))
			{
				System.out.print("Well then... You are thinking about a... Dust mite!");
			}
			else
			{
				System.out.print("It must be a 3 piece pizza. I'm really hungry.");
			}
		}
		else
		{
			System.out.print("I have not idea what you are talking about.");
		}
	}
}