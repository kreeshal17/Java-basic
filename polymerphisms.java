
class Student {
    int roll;
    String name;

    public void info(int roll, String name) {
        System.out.println(roll + " " + name);

    }

    public void info(int roll) {
        System.out.println(roll);
    }

}

public class polymerphisms {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "ram";
        s1.roll = 4;
        s1.info(s1.roll);

    }

}
