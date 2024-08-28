public class Capacity {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer();
        System.out.println(str.capacity());
        str.append("Hello");
        System.out.println(str.capacity());
        str.append("Hello, new sweet world");
        System.out.println(str.capacity());
    }
}
