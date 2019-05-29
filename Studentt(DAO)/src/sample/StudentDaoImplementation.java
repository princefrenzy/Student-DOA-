package sample;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImplementation implements StudentDao {


    //list works as a database
    List<Student> students;

    public StudentDaoImplementation(){
        students = new ArrayList<Student>();
        Student student1 = new Student("Abebe",0);
        Student student2 = new Student("Debebe",1);
        students.add(student1);
        students.add(student2);

    }

    @Override
    public List<Student> getAllStudents() {
        return students;

    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);

    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student : Roll No" + student.getRollNo()+ "updated ");

    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No" + student.getRollNo() + ", delete from AAU database");


    }
}
