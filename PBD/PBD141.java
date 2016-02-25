import java.util.Random;

public class PBD141
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] array = new int[1000];
		int x = 0;

		for(int i = 0; i < array.length; i++)
		{	
			array[x] = r.nextInt(99);
			x++;
			System.out.print(array[i] + " ");
		}
	}
}