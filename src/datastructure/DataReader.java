package datastructure;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("MidTermQuestion-master/src/data/self-driving-car.txt");

        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String filePath = "src/data/self-driving-car";
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("File not found Exception");
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println("File Already closed");
            }
        }
    }
}
