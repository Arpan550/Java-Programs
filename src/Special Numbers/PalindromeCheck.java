import java.util.*;

class PalindromeCheck {
    String word;
    int length;

    PalindromeCheck() {
        word = "";
        length = 0;
    }

    void acceptWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        word = sc.nextLine();
    }

    boolean isPalindrome() {
        length = word.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        return word.equals(reverse);
    }

    void display() {
        if (isPalindrome()) {
            System.out.println("Palindrome word");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeCheck ob = new PalindromeCheck();
        ob.acceptWord();
        ob.display();
    }
}
