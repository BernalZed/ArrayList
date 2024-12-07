
package gradetracker;

import java.util.ArrayList;

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Grade: " + grade);
    }
}

public class GradeTracker {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Zedrick", 87.5));
        students.add(new Student(2, "Denmark", 92.0));
        students.add(new Student(3, "Elsa", 78.0));
        students.add(new Student(4, "Marie", 95.0));
        students.add(new Student(5, "Regie", 88.5));

        double total = 0;
        double highest = students.get(0).grade;
        double lowest = students.get(0).grade;

        for (Student student : students) {
            student.display();
            total += student.grade;
            if (student.grade > highest) highest = student.grade;
            if (student.grade < lowest) lowest = student.grade;
        }

        double average = total / students.size();
        System.out.println("\nAverage Grade: " + average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
    }
}
