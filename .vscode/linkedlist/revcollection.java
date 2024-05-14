import java.util.*;

public class revcollection {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        for (Integer krishal : ll) {
            System.out.print(krishal + ">");

        }
        System.out.println();
        Collections.reverse(ll);
        for (Integer krishal : ll) {
            System.out.print(krishal + ">");
            ;
        }
        {

        }
    }
}