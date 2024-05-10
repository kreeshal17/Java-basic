import java.util.*;

public class exceptionhand {
    public static void main(String[] args) {
        System.out.println("enter the index and number resp");
        int[] marks = new int[4];
        marks[0] = 10;
        marks[1] = 100;
        marks[2] = 210;
        Scanner Sc = new Scanner(System.in);
        int ind = Sc.nextInt();
        int number = Sc.nextInt();
        try {
            System.out.println(
                    "the  value at index is " + marks[ind] + " " + "and after div by number is" + marks[ind] / number);

        } catch (ArithmeticException e) {

            System.out.println("zero le divide nagara");
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}