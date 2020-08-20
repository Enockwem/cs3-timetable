package javaCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ReadingFile {
    public static void main(String[] args) {
        String filename = "./src/data/Lectures.csv";
        String[] data = null;
        List<List<String>> rows = new ArrayList<>();
            try {
                // Reading the data using the bufferedReader
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
                String row;
                // Reading the headings of the file
                String headlines = bufferedReader.readLine();
                while ((row = bufferedReader.readLine()) != null) {
                    data = row.split(",");
                    rows.add(Arrays.asList(data));
                }
                for (String word: headlines.split(",")){
                    System.out.print(word+"\t\t\t\t\t");
                }
                System.out.println();
                for (List k: rows) {
                    for (Object create: k){
                        System.out.print(create+"\t\t\t\t\t");
                    }
                    System.out.println();
                }
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
}