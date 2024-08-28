public class StringBufferLength {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("Tutorials");
        System.out.println(str);
        System.out.println(str.length());
        str.setLength(5);
        System.out.println(str);
        System.out.println(str.length());
    }
}
