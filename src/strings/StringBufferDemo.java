public class StringBufferDemo {
    public static void main(String args[]) {
        String s = new String("Hello");
        String s1 = s.concat(" World");
        System.out.println(s);
        System.out.println(s1);

        StringBuffer str = new StringBuffer("Hello");
        str.append(" World");
        System.out.println(str);
    }
}
