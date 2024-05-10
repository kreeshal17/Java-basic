import java.util.*;

public class learArray {
    public static void main(String[] args)

    {
        Integer[] num = { 1, 2, 3, 4, 5, 6 };
        Arrays.sort(num, Comparator.reverseOrder());
        for (Integer i : num) {
            System.out.println(i);
        }

    }
}