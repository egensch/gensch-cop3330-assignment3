/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Emily Gensch
 */
package ex41;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

public class NameSorter {
@Test
    public static void readNames(Scanner input, ArrayList<String> names)
    {
        while (input.hasNextLine())
        {
            names.add(input.nextLine());
        }
    }

    public static void outputNames(ArrayList<String> names) throws IOException
    {
        FileWriter output = new FileWriter("exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("--------------------\n");

        for (String i : names)
        {
            output.write(i + "\n");
        }
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new File("C:\\Users\\EmilyGensch\\Desktop\\COP3330\\Projects\\exercise41_input.txt"));

        ArrayList<String> names = new ArrayList<String>();
        readNames(inputFile, names);

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        inputFile.close();

        try
        {
            outputNames(names);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

