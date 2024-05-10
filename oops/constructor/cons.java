class Student{
    String name;
    int roll;
    Student()
    {
        System.out.println("kreeshal is my name");
    }
 public void reply()
 {
    System.out.println("the name of person is"+ name + " " + "roll is " + roll);
 }
}
public class cons{
    public static void main(String [] args)
    {
        Student s= new Student();
        s.name= "ram";
        s.roll=4;
    s.reply();

    }
}