public class PBD151
{
	public static void main(String[] args)
	{
		String[] lastName = {"Mitchell", "Ortiz", "Luu", "Zimmerman", "Brooks"};

		double[] grade = {99.5, 78.5, 95.6, 96.8, 82.7};

		int[] id = {123456, 812335, 345345, 566543, 465464};

		System.out.print("Values: \n");

		for(int i = 0; i < lastName.length; i++)
		{
			System.out.print(lastName[i] + "  " + grade[i] + "  " + id[i] + "\n");
		}

		System.out.print("ID number to find: " + id[4]);
		System.out.println();

		for(int i = 0; i < lastName.length; i++)
		{
			System.out.print("Found in slot " + i + "\n");
			System.out.print("         Name: " + lastName[i] + "\n");
			System.out.print("         Average: " + grade[i] + "\n");
			System.out.print("         ID: " + id[i] + "\n");
		}
	}
}