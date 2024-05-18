import java.util.*;

class LL {
  ArrayList<Integer> list = new ArrayList<>();

  boolean isEmpty() {
    return list.size() == 0;
  }

  public void push(int data) {
    list.add(data);
  }

  public int pop() {
    if (isEmpty())

    {
      return -1;
    }
    int top = list.get(list.size() - 1);
    list.remove(list.get(list.size() - 1));
    return top;

  }

  public int peek()

  {
    if (isEmpty())

    {
      return -1;

    }
    return list.get(list.size() - 1);
  }
}

public class usingarrlist {
  public static void main(String[] args) {
    LL stack = new LL();
    stack.push(3);
    stack.push(2);
    stack.push(1);
    while (!stack.isEmpty()) {

      System.out.println(stack.peek());
      stack.pop();

    }

  }

}
