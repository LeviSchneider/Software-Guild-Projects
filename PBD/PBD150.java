public class PBD150
{
	public static void main( String[] args )
	{
		String[] arr1 = { "alpha", "bravo", "charlie" };
		int[] arr2 = {11, 23, 37, 41, 53};
		System.out.print("The first array is filled with the following values:\n");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.print( arr1[i] + " " );
		}

		System.out.print("\nThe second array is filled with the following values: ");
		for(int i = 0; i < arr2.length; i++)
		{
			System.out.print( arr2[i] + " " );

		}
	}
}