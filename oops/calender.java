import java.util.*;

public class calender {
    public static void main(String[] args) {
        Calendar C = Calendar.getInstance();
        System.out.println(C.get(Calendar.MINUTE));
        System.out.println(C.get(Calendar.HOUR));
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2004));

    }
}