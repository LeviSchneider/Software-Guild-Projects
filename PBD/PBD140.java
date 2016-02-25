import java.util.Random;

public class PBD140
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int[] array = {r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100), r.nextInt(100)};

		for(int i = 0; i < array.length; i++)
		{
			System.out.println("Slot " + i + " contains a " + array[i]);
		}
	}
}