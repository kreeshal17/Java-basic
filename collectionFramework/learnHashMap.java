import java.util.*;

public class learnHashMap {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();// TreeMap lekhe data order ma aaunxa teti ho differece ani time
                                                   // complecity log n hunxa ahile nalekhda 0 xa
        num.put("krishal", 4);
        num.put("Ramesh", 45);
        num.put("Ajay", 47);
        num.put("krishal", 22);// update garxa naya banaundaina
        // if(!num.containsKey("ram"))
        // {
        // num.put("ajay",49);
        // }
        num.putIfAbsent("krishal", 99);// another way
        System.out.println(num);
        System.out.println(num.keySet());// to get key
        System.out.println(num.containsValue(4));
        System.out.println(num.containsKey("krishal"));
        System.out.println(num.isEmpty());
        System.out.println(num.remove("Ajay"));
        System.out.println(num);
        // to iterate
        for (Map.Entry<String, Integer> entry : num.entrySet()) {
            System.out.println("key:" + entry.getKey() + "values: " + entry.getValue());
        }

    }
}