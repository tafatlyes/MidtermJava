package datastructure;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Lyes");
        arrayList.add("Tafat");
        arrayList.add("PNT");
        arrayList.add("2020");
        arrayList.add("JAVA");
        arrayList.add(1, "first");
        arrayList.add(2, "second");
        arrayList.add(3, "third");
        arrayList.add(4, "fourth");

        arrayList.remove("JAVA");
        arrayList.remove(4);

        System.out.println(arrayList);
        System.out.println(arrayList.get(1));


        System.out.println("Using for loop:");
        for (String s : arrayList)
            System.out.println(s);

        System.out.println("using while loop with Iterator");
        Iterator<String> itter = arrayList.iterator();
        while (itter.hasNext())
            System.out.println(itter.next());


        System.out.println("sorting data:");
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

}
