import java.util.Scanner;

public class PBD149
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String loopBreak = "continue";
		int largeValue = 0;
		int counter = 0;
		int largeNumCounter = 0;
		int[] array = {34, 55, 12, 56, 78, 94, 28, 59, 67, 17};
		
		System.out.print("Array: ");
		for(int i = 0; i < array.length; i++)
		{
			counter++;
			System.out.print(array[i] + ", ");
			if(array[i] > largeValue)
			{
				largeValue = array[i];
				largeNumCounter = counter -1;
			}
		}
		System.out.print("The largest value is " + largeValue + ".\n");
		System.out.print("It is in slot " + largeNumCounter + ".");
	}
}