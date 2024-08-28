// Define the first interface
interface Interface1 {
    void method1();
}

// Define the second interface
interface Interface2 {
    void method2();
}

// Create a class that implements both interfaces
class MultipleInterfaceImplementation implements Interface1, Interface2 {
    public void method1() {
        System.out.println("Method 1 from Interface 1");
    }

    public void method2() {
        System.out.println("Method 2 from Interface 2");
    }

    public static void main(String[] args) {
        MultipleInterfaceImplementation example = new MultipleInterfaceImplementation();
        example.method1();
        example.method2();
    }
}
