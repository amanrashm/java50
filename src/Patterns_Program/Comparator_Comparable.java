package Patterns_Program;
import java.util.*;

public class Comparator_Comparable {
    public static void main(String[] args) {

        /*List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(20);
        integers.add(2);
        integers.add(3);

        Comparator<Integer> intComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(integers, intComparator);
        System.out.println(integers);*/

        List<Student> students = new ArrayList<>();
        students.add(new Student(23, "Aman"));
        students.add(new Student(27, "Anand"));
        students.add(new Student(25, "Swati"));

        Collections.sort(students);

        System.out.println(students);
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student j) {
        /*return Integer.compare(this.age, j.age);*/
        /*return this.name.compareTo(j.name);*/
        if(this.age>j.age)
            return 1;
        else
            return -1;
    }
}