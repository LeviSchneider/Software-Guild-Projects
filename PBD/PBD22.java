public class PBD22{
	public static void main(Stringp[] args){
		Scanner keyboard = new Scanner(System.in);

		String name;
		int age;

		System.out.print("What's your name?");
		name = keyboard.next();
		System.out.print("How old are you?");
		age = keyboard.nextInt();

		if(age < 16){
			System.out.println("You cannot drive!");
		} else if(age > 16 || age < 18){
			System.out.println("You can't vote!");
			System.out.println("You can't rent a car!");
		} else if(age >= 18 || age < 25){
			System.out.println("You can't rent a car!");
		} else {
			System.out.println("You can do anything legal! *wink**wink*");
		}
	}
}