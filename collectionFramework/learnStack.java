import java.util.*;

public class learnStack {
    public static void main(String[] args) {
        Stack<String> S = new Stack<>();
        S.push("i ");
        S.push(" r");
        S.push(" s");
        S.push(" k");
        System.out.println(S);
        String c = S.peek();
        System.out.println(c);
        S.pop();
        System.out.println(S);
    }

}
