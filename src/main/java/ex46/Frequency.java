/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex46;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Frequency {
    public static void wordCount(String word1)
    {
        int wordCount = 0;
        for (int i = 0; i<wordCount; i++)
        {
            System.out.print("*");
        }

    }

        @Test
        public static void main(String[] args){
            //Find the file
            String word1 = "badger";
            String word2 = "snake";
            String word3 = "mushroom";

            try {
                File myObj = new File("C:\\Users\\EmilyGensch\\Desktop\\COP3330\\Projects\\exercise46_input.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                    if (myReader.next().equals(word1)) {
                        wordCount(word1);
                    }
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            //Find each word
            Map<String,Integer> freq = new HashMap<String,Integer>();
            String[] words;
            for(String word : words) {
                String w = word.toLowerCase();
                if (freq.containsKey(w)) {
                    freq.put(w,freq.get(w)+1);
                } else {
                    freq.put(w,1);
                }
            }


            //count each word
            //make a table

        }


}

