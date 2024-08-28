public class StringTrim {
    public static void main(String args[]) {
        String str = "    Hello World    ";
        System.out.println(str.length());
        System.out.println(str.trim().length());
        System.out.println(str.length());
        System.out.println(str.trim().substring(4,7).length());
    }
}
