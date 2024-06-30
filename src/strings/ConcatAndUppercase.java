package strings;

public class ConcatAndUppercase {
    public static void main(String[] args) {
        String firstName="Android";
        String lastName="Developer";

        String fullName1=firstName+" "+lastName;
        String fullName2=firstName.concat(" ").concat(lastName);

        System.out.println(fullName1);
        System.out.println(fullName2);

        System.out.println(fullName1.toUpperCase());
        System.out.println(fullName2.toUpperCase());
    }
}
