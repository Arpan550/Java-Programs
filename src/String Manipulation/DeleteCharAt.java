public class DeleteCharAt {
    public static void main(String args[]) {
        StringBuffer str = new StringBuffer("HelloWorld");
        System.out.println(str.delete(2, 4));
        System.out.println(str.deleteCharAt(3));
    }
}
