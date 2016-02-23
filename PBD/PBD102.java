import java.util.Scanner;

public class PBD102
{
	public static int month_offset( int month )
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please print out what month you would like to offset. (1=January 2=February 3=March, etc");
		month = sc.nextInt();
		int result;

        switch(month)
        {
            case 1:
            result = month * 1;
                break;
            case 2:
            result = month * 2;
                break;
            case 3:
            result = month * 1 + 3;
                break;
            case 4:
            result = month * 0;
                break;
            case 5:
            result = (month - 1) / 2;
                break;
            case 6:
            result = month - 1;
                break;
            case 7:
            result = month - 7;
                break;
            case 8:
            result = month / 2 - 1;
                break;
            case 9:
            result = month * 2 / 3;
                break;
            case 10:
            result = month / 2 - 4;
                break;
            case 11:
            result = (month - 3) / 2;
                break;
            case 12:
            result = month / 2;
                break;
            default:
            result = (month/month)*(-1);
                break;
        }

		return result;
	}


	public static void main( String[] args )
	{
		System.out.println( "Offset for month 1: " + month_offset(1) );
		System.out.println( "Offset for month 2: " + month_offset(2) );
		System.out.println( "Offset for month 3: " + month_offset(3) );
		System.out.println( "Offset for month 4: " + month_offset(4) );
		System.out.println( "Offset for month 5: " + month_offset(5) );
		System.out.println( "Offset for month 6: " + month_offset(6) );
		System.out.println( "Offset for month 7: " + month_offset(7) );
		System.out.println( "Offset for month 8: " + month_offset(8) );
		System.out.println( "Offset for month 9: " + month_offset(9) );
		System.out.println( "Offset for month 10: " + month_offset(10) );
		System.out.println( "Offset for month 11: " + month_offset(11) );
		System.out.println( "Offset for month 12: " + month_offset(12) );
		System.out.println( "Offset for month 43: " + month_offset(43) );
	}


}