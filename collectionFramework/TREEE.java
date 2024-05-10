import java.util.*;

public class TREEE {
    public static void main(String[] args) {
        // Set <Integer> set= new HashSet<>();//random order ma dinxa real order ma
        // chahiye Linked HashTree use hanne
        // Set<Integer> set = new LinkedHashSet<>();//order haleko ma chchiye garne
        // yesto
        Set<Integer> set = new TreeSet<>(Comparator.reverseOrder());// binary search tree i mean to say ki shorting plus
                                                                    // sete chahiye
        set.add(5);
        set.add(52);
        set.add(51);
        set.add(58);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.remove(58));
        System.out.println(set);
        System.out.println(set.contains(77));
        System.out.println(set.isEmpty());
    }
}
