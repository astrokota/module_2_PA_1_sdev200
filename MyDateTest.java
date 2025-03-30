//main method for testing MyDate.java that creates two objects (one with no arg, one with specific milliseconds)
public class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(); //curent date
        MyDate date2 = new MyDate(34355555133101L); //specific milliseconds given in instructions

        //print statements to console
        System.out.println("Date 1: Year = " + date1.getYear() + ", Month = " + (date1.getMonth() + 1) + ", Day = " + date1.getDay());
        System.out.println("Date 2: Year = " + date2.getYear() + ", Month = " + (date2.getMonth() + 1) + ", Day = " + date2.getDay());
    }
}