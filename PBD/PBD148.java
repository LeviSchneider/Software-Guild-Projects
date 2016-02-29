import java.util.Scanner;

public class PBD148
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String loopBreak = "continue";
		int largeValue = 0;
		int[] array = {34, 55, 12, 56, 78, 94, 28, 59, 67, 17};
		
		System.out.print("Array: ");
			for(int i = 0; i < array.length; i++)
			{
				System.out.print(array[i] + ", ");
				if(array[i] > largeValue)
				{
					largeValue = array[i];
				}
			}
			System.out.print("The largest value is " + largeValue + ".\n");
	}
}