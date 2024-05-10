import java.util.*;

public class learnArrayDEque {
    public static void main(String args[]) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(20);// add element at last of queue
        adq.offerLast(220);// same as offer
        adq.offerFirst(120);// add at head
        adq.offerFirst(1220);// add at head
        System.out.println(adq);
        System.out.println(adq.poll());// queue ma first element niskinxa vanes
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

    }
}
