import java.util.Scanner;

public class PBD104
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Shape Area Calculator version 0.1\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		System.out.print("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit\nWhich shape: \n");
		choice = sc.nextInt();

		while(choice != 5)
		{
		switch(choice)
		{
			case 1:
				System.out.print("Base: ");
				int base = sc.nextInt();
				System.out.print("Height: ");
				int height = sc.nextInt();
				System.out.print("The area is " + area_triangle(base, height) + ".\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				break;
			case 2:
				System.out.print("width: ");
				int width = sc.nextInt();
				System.out.print("Length: ");
				int length = sc.nextInt();
				System.out.print("The area is " + area_rectangle(length, width) + ".\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				break;
			case 3:
				System.out.print("Side: ");
				int side = sc.nextInt();
				System.out.print("The area is " + area_square(side) + ".\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				break;
			case 4:
				System.out.print("Radius: ");
				int radius = sc.nextInt();
				System.out.print("The area is " + area_circle(radius) + ".\n");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
				break;
			default:
				break;
		}
		System.out.print("1) Triangle\n2) Rectangle\n3) Square\n4) Circle\n5) Quit\nWhich shape: \n");
		choice = sc.nextInt();
		}
	}

	//returns the area of a circle
	public static double area_circle(int radius)
	{
		Scanner sc = new Scanner(System.in);
		double area;

		area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	public static int area_rectangle(int length, int width)
	{
		Scanner sc = new Scanner(System.in);
		int area;

		area = length * width;
		return area;
	}

	public static int area_square(int side)
	{
		Scanner sc = new Scanner(System.in);
		int area;

		area = side * side;
		return area;
	}

	public static double area_triangle(int base, int height)
	{
		Scanner sc = new Scanner(System.in);
		double area;

		area = (base * height) / 2;
		return area;
	}
}