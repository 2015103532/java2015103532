public class Date {
 
    private int month;
    private int day;
    private int year;
     
     Date () {
        month = 0;
        day = 0;
        year = 0;
    }
     
     void setMonth (int r) {
        month = r;
    }
     
     int getMonth() {
        return month;
    }
     
     void setday (int s) {
        day = s;
    }
     
     int getDay() {
        return day;
    }
     
     void setYear (int w ) {
        year = w;
    }
     
     int getYear() {
        return year;
    }
     
    void displayDate () {
        System.out.printf ("\n%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
 
}
