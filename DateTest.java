import java.util.Scanner;
 
public class DateTest {
    public static void main (String [] args) {
         
        Date d = new Date ();
 
 Scanner input = new Scanner (System.in);
         
        int month;
        int day;
        int year;
         
        System.out.print ("Enter the  Month: ");
        month = input.nextInt();
        d.setMonth(month);
        System.out.println ("Enter the  Day: ");
        day = input.nextInt();
        d.setday(day);
        System.out.println ("Enter the Year: ");
        year = input.nextInt();
        d.setYear(year);
        d.displayDate();
 
    }
}
