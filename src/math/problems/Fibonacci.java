package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int n1 = 0, n2 = 1, sum = n1 + n2;

        for (int i = 1; i <= 40; i++) {
            System.out.print(n1 + " ");

            n1 = n2;
            n2 = sum;
            sum = n1 + n2;
        }
    }
}
