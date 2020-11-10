package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */

        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        System.out.println("The missing number from the array is: "+getMissingNo(array, array.length));
    }

        static int getMissingNo(int a[], int n) {
            int total = 1;
            for (int i = 2; i <= (n + 1); i++) {
                total += i;
                total -= a[i - 2];
            }
            return total;
        }
    }

