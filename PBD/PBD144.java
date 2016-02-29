import java.util.Scanner;

public class PBD144
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String loopBreak = "continue";
		int[] array = {34, 55, 12, 56, 78, 94, 28, 59, 67, 17};

		System.out.print("Please print a number that you would like to find in this array..");
		
		while(loopBreak.equals("continue"))
		{
			int j = sc.nextInt();
			for(int i = 0; i < array.length; i++)
			{
				if(j == array[i])
				{
					System.out.print(array[i] + " is in the array.");
					loopBreak = "break";
				}
			}
		}
	}
}