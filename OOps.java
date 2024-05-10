
class Student {
    String name;
    int claes;

    public void info() {
        System.out.println(this.name);
        System.out.println(this.claes);
    }

}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "ram";
        s1.claes = 5;
        s2.name = "rani";
        s1.info();
    }
}