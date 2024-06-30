package OOPs;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    public static void setMaxCapacity(int maxCapacity) {
        Course.maxCapacity = maxCapacity;
    }

    public void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments++] = studentName;
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
        }
    }

    public void unenrollStudent(String studentName) {
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[--enrollments] = null;
                System.out.println(studentName + " unenrolled from " + courseName);
                return;
            }
        }
        System.out.println(studentName + " is not enrolled in " + courseName);
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in " + courseName + ":");
        for (int i = 0; i < enrollments; i++) {
            System.out.println(enrolledStudents[i]);
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public int getEnrollments() {
        return enrollments;
    }

    public static int getMaxCapacity() {
        return maxCapacity;
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Java Programming");

        javaCourse.enrollStudent("Arpan");
        javaCourse.enrollStudent("Bob");
        javaCourse.enrollStudent("Rahul");

        javaCourse.displayEnrolledStudents();

        javaCourse.unenrollStudent("Bob");

        javaCourse.displayEnrolledStudents();
    }
}
