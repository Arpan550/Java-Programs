public class Replace {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("Hi,JIS COLLEGE");
        str.replace(3, 6, "NIT");
        System.out.println(str);
    }
}
