package datastructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        Map<Integer, String> usa = new LinkedHashMap<Integer, String>();

        usa.put(0, "NY");
        usa.put(1, "NJ");
        usa.put(2, "CT");
        usa.put(3, "MA");
        usa.put(4, "CA");
        usa.put(5, "RI");


        for (Map.Entry<Integer, String> states : usa.entrySet()) {
            System.out.println(states.getKey() + " " + states.getValue());
        }
        System.out.println("");

        List<String> canada = new ArrayList<>();

        canada.add("ON");
        canada.add("QC");
        canada.add("NT");
        canada.add("PE");


        List<String> france = new ArrayList<>();

        france.add("paris");
        france.add("lyon");
        france.add("peau");

        Map<Integer, List<String>> map2 = new LinkedHashMap<>();

        map2.put(1, canada);
        map2.put(2, france);

        for (Map.Entry<Integer, List<String>> cites : map2.entrySet()) {
            System.out.println(cites.getKey() + "  " + cites.getValue());
        }

    }

}
