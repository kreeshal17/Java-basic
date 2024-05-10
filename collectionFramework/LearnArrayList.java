
import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(111);
        List.add(10);
        List.add(1145);
        List.add(1125);
        List.add(11245);
        System.out.println(List);
        List.add(2, 50);
        System.out.println(List);
        System.out.println(List.get(2));
        System.out.println(List.remove(1));
        System.out.println(List.remove(Integer.valueOf(111)));
        System.out.println(List);
        System.out.println(List.contains(1125));
        List.set(2, 5000);
        // to iterate
        for (int i = 0; i < List.size(); i++) {
            System.out.println("the list is " + List.get(i));
        }
        for (Integer kree : List) {
            System.out.println("the elements are" + kree);
        }
    }
}