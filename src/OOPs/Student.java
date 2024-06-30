package OOPs;

public class Student {
    String name;
    int age;

    Student(){

    }

    Student(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Student Details: { name: "+name+", age: "+age+" }";
    }

    public static void main(String[] args) {
        Student student1=new Student("Arpan",21);
        System.out.println(student1.toString());
    }
}
