final class FinalClassExample {
    void display()
    {
        System.out.println("Displaying from FinalClassExample");
    }
}

public class Final_Class {
    public static void main(String[] args)
    {
        // Attempting to inherit from a final class will result in a compilation error
        FinalClassExample example = new FinalClassExample();
        example.display();
    }
}