package basics;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string: ");
        String str=sc.next();

        if(isPalindrome(str)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palindrome");
        }
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length()-1));
    }
}
