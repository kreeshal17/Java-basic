import java.util.*;

public class learnPRiorityqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// if we didnot use comparator.reverseoorDER
                                                                           // THEN ASCENDING order ma hunthhyo cause
                                                                           // minheap use hunthhyo yesma
        pq.offer(44);
        pq.offer(444);
        pq.offer(4);
        pq.offer(244);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }

}
