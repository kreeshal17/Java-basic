import java.util.*;

public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(25);
        q.offer(58);// to add element we use offer it return true when added but not exception
        q.offer(55);
        q.offer(555);
        q.offer(223);
        System.out.println("" + q);
        q.poll();
        System.out.println("" + q);// first added element nai niskiyo
        q.remove(Integer.valueOf(58));
        System.out.println(q);
        System.out.println((q.peek()));// first added is the nearest one to get remove
        // iterate
        for (Integer k : q) {
            System.out.println(" " + k);
        }

    }
}
