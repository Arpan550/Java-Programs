class Parent {
    final void display()
    {
        System.out.println("Displaying from Parent");
    }
}

class Child extends Parent {
    // Attempting to override the final method from the Parent class will result in a compilation error
    /*final void display() {
        System.out.println("Displaying from FinalMethodExample");
    }*/
    void show()
    {
        System.out.println("Final method cannot be overridden");
    }
}
public class Final_Method {
    public static void main(String[] args)
    {
        Child example = new Child();
        example.display();
        example.show();
    }
}
