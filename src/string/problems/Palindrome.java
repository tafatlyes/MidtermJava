package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String original = "MADAM";
        original = original.replace(" ", ""); //I did this to replace the spaces between words to no spaces!

        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        boolean palindrome = true;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != reverse.charAt(i)) {
                palindrome = false;
            }
        }

        if (palindrome) {
            System.out.println("The given String <<" + original + ">> is a Palindrome!");
        } else {
            System.out.println("The given String <<" + original + ">> is Not a Palindrome!");
        }
    }
}



