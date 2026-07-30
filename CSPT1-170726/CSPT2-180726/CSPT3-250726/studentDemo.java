import java.util.Scanner;

class person
{
    String name;
    int age;
}
class Student extends person {
     int rollno;
     String course;
     void dispalyDetails()
     {
        System.out.println("\nStudent Details");
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Course: " +course);

        

     }
}
public class studentDemo 
{

}