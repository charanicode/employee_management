import java.util.ArrayList;
import java.util.Scanner;

class Student{
     int studentId;
    String studentName;
    int[] marks=new int[5];
    Student(int studentId,String studentName,int marks[]){
        this.marks=marks;
        this.studentId=studentId;
        this.studentName=studentName;
    }
    public int  calculateTotal(){
        int sum=0;
        for (int i = 0; i < marks.length ; i++) {
            sum+=marks[i];
        }
        return sum;
    }
    public float calculateAverage(){
        int sum=calculateTotal();
        float avg=sum/5.0f;
        return avg;
    }
    public void calculateGrade(){
        float avg=calculateAverage();
        if(avg>=90 && avg<=100){
            System.out.println("Grade A");
        }
        else if(avg>=75 && avg<=89){
            System.out.println("Grade B");
        }
        else if(avg>=60 && avg<=74){
            System.out.println("Grade C");
        }
        else if(avg>=40 && avg<=59){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }

}
class ResultSystem{
    ArrayList<Student> student=new ArrayList<>();
    public void addStudent(Student id){
        student.add(id);
    }
    public void displayAllResults(){
        for(Student s:student){
            System.out.println("Student ID: "+s.studentId);
            System.out.println("Student Name: "+s.studentName);
            System.out.println("Average: "+s.calculateAverage());
            System.out.println("Total: "+s.calculateTotal());
        }
    }
    public void searchStudentById(int student_id){
        boolean found = false;
       for(Student s:student){
           if(student_id==s.studentId){
               found=true;
               System.out.println("Student Name: "+s.studentName);
           }
       }
       if(!found){
           System.out.println("Student not found");
       }
    }
}
public class student_result{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter student_id: ");
        int id= scanner.nextInt();
        System.out.println("enter student name: ");
        scanner.nextLine();
        String name=scanner.nextLine();
        System.out.println("enter marks:");
        int[] marks=new int[5];
        for (int i = 0; i <5; i++) {
            marks[i]=scanner.nextInt();
        }
        Student student=new Student(id,name,marks);
        System.out.println("average: "+student.calculateAverage());
        System.out.println("Total: "+ student.calculateTotal());
        student.calculateGrade();
        ResultSystem rs = new ResultSystem();
        rs.addStudent(student);
        rs.displayAllResults();
        rs.searchStudentById(id);
    }
}
