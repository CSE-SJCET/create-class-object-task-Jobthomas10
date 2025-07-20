class Student{
     String name;
     int rollno;
     char grade;

    public void displayDetails(){
         System.out.println("student name:"+name);
         System.out.println("rollno:"+rollno);
         System.out.println("grade"+grade);

}
public class Main {
      public static void main(String[] args) {
           Student student=new Student();
           student.name="jack";
           student.rollno=19;
           student.grade='A';
           student.displayDetails();
        // TODO: Create a Student object and call the method to display details
    }
}
