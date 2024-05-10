class Common {
    public void area() {
        System.out.println("the area is given as ");
    }

}

class Triangle extends Common {
    public int area(int x, int y) {
        return x * y / 2;
    }
}

class Eq extends Triangle {
    public int area(int x, int y) {
        System.out.println("the sum of length is");
        return x + y;
    }
}

public class Inher {
    public static void main(String args[]) {
        Eq e = new Eq();
        e.area(2, 3);

    }
}