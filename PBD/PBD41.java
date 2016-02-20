import java.util.Random;

public class PBD41
{
	public static void main ( String[] args )
	{
		Random r = new Random();

		int x = 1 + r.nextInt(10);

		System.out.println( "My random number is " + x );

		System.out.println( "Here are some numbers from 1 to 6!" );
		System.out.print( 1 + r.nextInt(6) + " " );
		System.out.print( 1 + r.nextInt(6) + " " );
		System.out.print( 1 + r.nextInt(6) + " " );
		System.out.print( 1 + r.nextInt(6) + " " );
		System.out.print( 1 + r.nextInt(6) + " " );
	}
}