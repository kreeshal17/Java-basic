class Student{
    String cast;
    int roll;
    public void kree()
    {
    System.out.println("yes we did it");
    System.out.println(this.roll);
    }
}
 public class polymerphisms{
    public static void main(String [] args)

    {
        Student s= new Student();
        s.roll=5;
        s.cast="karki";
        System.out.println(s.cast);
        s.kree();

        
    }
}