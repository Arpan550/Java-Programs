public class IndexOf {
    public static void main(String args[]) {
        String s1 = "Hello, Welcome to the world of programming. I am a student in BTech and currently in 3rd year";
        System.out.println(s1.indexOf('a'));
        System.out.println(s1.indexOf('a', 10));
        System.out.println(s1.indexOf("and", 10));
        System.out.println(s1.indexOf("and"));
        System.out.println(s1.lastIndexOf('a'));
    }
}
