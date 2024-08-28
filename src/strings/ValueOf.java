public class ValueOf {
    public static void main(String args[]) {
        int a = 10;
        System.out.println(a);

        String s = String.valueOf(a);
        System.out.println(s + 30);

        String str = "10";
        Integer obj = Integer.valueOf(str);
        System.out.println(obj + 20);
    }
}
