class student {
    String name;
    int roll;

    student(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }

    public void reply() {
        System.out.println("the name is " + name + "and roll is " + roll);
    }
}

public class parametcons {

    public static void main(String[] args) {
        student s = new student(5, "ram");

        s.reply();
    }
}
