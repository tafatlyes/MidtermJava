package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

            String a = "CAT";
            String b = "ACT";

            boolean anangram = checkIfStringsAreAnangram(a, b);

            if (anangram) {
                System.out.println("anangram");
            } else {
                System.out.println("not anangram");
            }
        }

        public static boolean checkIfStringsAreAnangram(String a, String b) {

            char[] firstArray = a.toUpperCase().toCharArray();
            char[] secondArray = b.toUpperCase().toCharArray();

            Arrays.sort(firstArray);
            Arrays.sort(secondArray);

            return Arrays.equals(firstArray, secondArray);
        }
    }

