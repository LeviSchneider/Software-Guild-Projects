import java.util.Scanner;

public class PBD24 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);

		int weekDayNumber;
		String[] weekday = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

		System.out.print("Type in the day of the week: ");
		weekDayNumber = keyboard.nextInt();

		if(weekDayNumber <= 6)
		{
			for(int i = 0; i <= 6; i++){
				System.out.println("Weekday " + i + ": " + weekday[i]);
			}
		}
		else
		{
			System.out.println();
			System.out.println("Weekday " + weekDayNumber + ": ERROR!" );
		}
	}
}