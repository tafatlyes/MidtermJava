package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        System.out.println("Factorial of a given number using Iteration:"); //using  Iteration
        int num = 5;
        int factorial = 1;
        for (int i = num; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial is: " + factorial);
        //
        System.out.println();//space between the two programs
        //
        System.out.println("Factorial of a given number using Recursion:"); //using Recursion
        System.out.println("Factorial is: " + factorial(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}



