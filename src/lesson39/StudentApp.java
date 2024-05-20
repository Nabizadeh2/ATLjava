package lesson39;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students= {new Student(2345,"Jamila ",25),
        new Student(112,"Kate",34),
        new Student(126,"Onur",8),
        new Student(453,"Sara",18)};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));


        System.out.println("------------------------");

        Arrays.sort(students,new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName());
            }
        });

        System.out.println(Arrays.toString(students));

        System.out.println("===================");
         Arrays.sort(students, new Comparator<Student>() {
             @Override
             public int compare(Student s1, Student s2) {
                 return Integer.compare(s1.getAge(),s2.getAge());
             }
         });

        System.out.println(Arrays.toString(students));
    }


}
