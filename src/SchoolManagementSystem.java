import java.util.ArrayList;
import java.util.List;
import za.co.schoolmanagementsystem.School;
import za.co.schoolmanagementsystem.Student;
import za.co.schoolmanagementsystem.Teacher;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        Teacher Muzi = new Teacher(1, "Muzi", 400);
        Teacher James = new Teacher(2, "James", 500);
        Teacher Lindiwe = new Teacher(1, "Lindiwe", 700);
        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Muzi);
        teacherList.add(James);
        teacherList.add(Lindiwe);
        
        Student Mbali = new Student(1, "Mbali", 5);
        Student Fezile = new Student(2, "Fezile", 12);
        Student Sandile = new Student(3, "Sandile", 9);
        
        List<Student> studentList = new ArrayList<>();
        studentList.add(Mbali);
        studentList.add(Fezile);
        studentList.add(Sandile);
        
        School ghs = new School(teacherList, studentList);
        
        Mbali.payFees(4500);
        Fezile.payFees(6350);
        System.out.println("GHS has earned R" + ghs.getTotalMoneyEarned());
        
        System.out.println("******************Making GHS Pay Salary******************");
        Muzi.receiveSalary(Muzi.getSalary());
        System.out.println("GHS has spent some of their money to " + Muzi.getName() +
                           " and now they are left with R" + ghs.getTotalMoneyEarned());
        
        James.receiveSalary(James.getSalary());
        System.out.println("GHS has spent some of their money to " + James.getName() +
                           " and now they are left with R" + ghs.getTotalMoneyEarned());
        
        System.out.println(James);
        
    }
    
}
