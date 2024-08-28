public class Exception1 {
    public static void main(String args[]){
        int a=0, b=5;
        try{
            System.out.println(b/a);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
