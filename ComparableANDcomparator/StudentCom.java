package ComparableANDcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    int roll;
    String name;
    Student(int roll,String name)
    {
        this.roll=roll;
        this.name=name;
    }

}
public class StudentCom {
    public static void main(String[] args) {
        ArrayList<Student> stu=new ArrayList<>();
        stu.add(new Student(10,"A"));
        stu.add(new Student(5,"B"));
        stu.add(new Student(1,"C"));
        stu.add(new Student(2,"D"));
        stu.add(new Student(14,"E"));
        Comparator<Student> com=(Student a,Student b)->a.roll>b.roll?1:-1;
        Collections.sort(stu,com);
       for(Student s:stu)
       {
           System.out.println(s.name+" "+s.roll);
       }

    }
}
