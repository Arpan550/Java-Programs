public class Reverse {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("HelloWorld");
        System.out.println(str.reverse());
        str.insert(0, "hi");
        System.out.println(str);
    }
}
