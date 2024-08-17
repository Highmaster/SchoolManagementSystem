package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn );

        Student tamasha = new Student(1, "Tamasha", 4);
        Student jack = new Student(2, "Jack Chiorlu", 1);
        Student iche = new Student(3, "Ichebadu", 5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(jack);
        studentList.add(iche);

        School ghs = new School(teacherList, studentList);
        System.out.println("GHS has earned $" +ghs.getTotalMoneyEarned());
    }
}
