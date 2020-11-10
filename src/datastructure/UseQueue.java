package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("first print: " + numbers);

        numbers.poll();
        System.out.println("removing first number in line: " + numbers);

        numbers.poll();
        System.out.println("removing second number in line: " + numbers);


        System.out.println("to see which number is first in the line after removing the two first numbers: " + numbers.peek());
        System.out.println("to remove the number in the head of the line, the number deleted is: " + numbers.remove());

        System.out.println("************************************************");
        System.out.println("usinf for loop:");
        for (Integer xyz : numbers)
            System.out.println("the remaining numbers in the Queue are: " + xyz);

        System.out.println("************************************************");
        System.out.println("using while loop:");

        Iterator xyz = numbers.iterator();
        while (xyz.hasNext()) {
            System.out.println("the remaining numbers in the Queue are: " + xyz.next());
        }
    }
}
