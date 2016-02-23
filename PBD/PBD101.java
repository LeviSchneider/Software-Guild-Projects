import java.util.Scanner;

public class PBD101
{
    public static String month_name( int month )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Select a month to pick out. (1=January, 2=February, 3=March, etc)");
        month = sc.nextInt();
        String result;
        
        switch(month)
        {
            case 1:
            result = "January";
                break;
            case 2:
            result = "Februaruy";
                break;
            case 3:
            result = "March";
                break;
            case 4:
            result = "April";
                break;
            case 5:
            result = "May";
                break;
            case 6:
            result = "June";
                break;
            case 7:
            result = "July";
                break;
            case 8:
            result = "August";
                break;
            case 9:
            result = "September";
                break;
            case 10:
            result = "October";
                break;
            case 11:
            result = "November";
                break;
            case 12:
            result = "December";
                break;
            default:
            result = "Festivus... Just kidding ERROR please type in 1-12.";
                break;
        }
        return result;
    }

    public static void main( String[] args )
    {

        System.out.println( "Month 1: " + month_name(1) );
        System.out.println( "Month 2: " + month_name(2) );
        System.out.println( "Month 3: " + month_name(3) );
        System.out.println( "Month 4: " + month_name(4) );
        System.out.println( "Month 5: " + month_name(5) );
        System.out.println( "Month 6: " + month_name(6) );
        System.out.println( "Month 7: " + month_name(7) );
        System.out.println( "Month 8: " + month_name(8) );
        System.out.println( "Month 9: " + month_name(9) );
        System.out.println( "Month 10: " + month_name(10) );
        System.out.println( "Month 11: " + month_name(11) );
        System.out.println( "Month 12: " + month_name(12) );
        System.out.println( "Month 43: " + month_name(43) );
    }
}