import java.util.Scanner;

public class PBD147
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String loopBreak = "continue";
		int counter = 0;
		int[] array = {34, 55, 12, 56, 78, 94, 28, 59, 67, 17};
		
		while(!loopBreak.equals("break"))
		{
			System.out.print("Please print a number that you would like to find in this array..\n");
			int j = sc.nextInt();
			for(int i = 0; i < array.length; i++)
			{
				if(j == array[i])
				{
					System.out.print(array[i] + " is in slot " + i + ".\n");
					loopBreak = "break";
					counter++;
				}
			}
			System.out.print(j + " was found " + counter + " times.\n");

			if(!loopBreak.equals("break"))
			{
				System.out.print(j + " is not in the array.");
				System.out.print("Do you want to pick another number? (y/n)\n");
				String answer = sc.next();
				if(answer.equals("n"))
				{
					loopBreak = "break";
					System.out.print("Thank you for playing.");
				}
			}
		}
	}
}