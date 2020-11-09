package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        String s = "ABC";
        permutations(s.toCharArray(), 0);
    }

    public static void swap(char[] ch, int i, int j) { // Utility function to swap two characters in a character array
                                                       //The swap() method is used to swap the elements at the specified positions in the specified list.
                                                       // If the specified positions are equal, invoking this method leaves the list unchanged.
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void permutations(char[] ch, int currentIndex) {  // Recursive function to generate all permutations of a String
        if (currentIndex == ch.length - 1) {
            System.out.print("'"+String.valueOf(ch)+"'" + "   ");
        }

        for (int i = currentIndex; i < ch.length; i++) {
            swap(ch, currentIndex, i);
            permutations(ch, currentIndex + 1);
            swap(ch, currentIndex, i);
        }
    }
}
