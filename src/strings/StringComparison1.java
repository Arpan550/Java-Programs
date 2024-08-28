public class StringComparison1 {
    public static void main(String args[]) {
        String s1 = "Arpan";
        String s2 = "Arpan";

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
    }
}
