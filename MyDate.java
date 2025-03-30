//gregorian calendar used per instruction
import java.util.GregorianCalendar;

//class MyDate
public class MyDate {

    //data fields that represent a date
    private int year;
    private int month;
    private int day;

    //no arg constructor to create instance for current date
    public MyDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH); //month 0-based
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //constructor with elapsedTime arg that is since Jan 1, 1970 in milliseconds. long converts milliseconds into date
    public MyDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH); //month 0-based
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //constructor with specified year, month, day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //get method for year
    public int getYear() {
        return this.year;
    }

    //get method for month
    public int getMonth() {
        return this.month;
    }

    //get method for day
    public int getDay() {
        return this.day;
    }

    //method sets a new date based on elapsedTime 
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(GregorianCalendar.YEAR);
        this.month = calendar.get(GregorianCalendar.MONTH);
        this.day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
