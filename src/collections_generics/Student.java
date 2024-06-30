package collections_generics;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getGrade(), s2.getGrade());
    }
}

class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a priority queue of Student objects ordered by grade
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentComparator());

        // Add students to the priority queue
        pq.offer(new Student("A", 85));
        pq.offer(new Student("B", 92));
        pq.offer(new Student("C", 78));
        pq.offer(new Student("D", 88));

        // Poll elements from the priority queue (sorted by grade)
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
