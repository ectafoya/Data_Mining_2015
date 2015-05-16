import java.util.ArrayList;
import java.io.*;


/**
 * Created by Eduardo on 5/11/2015.
 */
public class DocumentSplitter {

    public void split() throws IOException {

        String filePath = new File("").getAbsolutePath(); // to get the path to the folder where this file is
        System.out.println(filePath);

        // to read each one of the five files
        BufferedReader reader1 = new BufferedReader(new FileReader(filePath + "/data/Score1.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader(filePath + "/data/Score2.txt"));
        BufferedReader reader3 = new BufferedReader(new FileReader(filePath + "/data/Score3.txt"));
        BufferedReader reader4 = new BufferedReader(new FileReader(filePath + "/data/Score4.txt"));
        BufferedReader reader5 = new BufferedReader(new FileReader(filePath + "/data/Score5.txt"));

        //to write the results to a file
        PrintWriter writer1 = new PrintWriter("Score1-split.txt", "UTF-8");
        PrintWriter writer2 = new PrintWriter("Score2-split.txt", "UTF-8");
        PrintWriter writer3 = new PrintWriter("Score3-split.txt", "UTF-8");
        PrintWriter writer4 = new PrintWriter("Score4-split.txt", "UTF-8");
        PrintWriter writer5 = new PrintWriter("Score5-split.txt", "UTF-8");

        String line;
        String delimiter = "\\s+"; // any amount of whitespace as a delimiter
        String[] temp;

        // Read file 1, split it and write it to a file
        while ((line = reader1.readLine()) != null ) {
            temp = line.split(delimiter);
            for (int i = 0 ; i < temp.length ; i++) {
                writer1.println(temp[i]);
            }
        }
        writer1.close();

        // Read file 2, split it and write it to a file
        while ((line = reader2.readLine()) != null ) {
            temp = line.split(delimiter);
            for (int i = 0 ; i < temp.length ; i++) {
                writer2.println(temp[i]);
            }
        }
        writer2.close();

        // Read file 3, split it and write it to a file
        while ((line = reader3.readLine()) != null ) {
            temp = line.split(delimiter);
            for (int i = 0 ; i < temp.length ; i++) {
                writer3.println(temp[i]);
            }
        }
        writer3.close();

        // Read file 4, split it and write it to a file
        while ((line = reader4.readLine()) != null ) {
            temp = line.split(delimiter);
            for (int i = 0 ; i < temp.length ; i++) {
                writer4.println(temp[i]);
            }
        }
        writer4.close();

        // Read file 5, split it and write it to a file
        while ((line = reader5.readLine()) != null ) {
            temp = line.split(delimiter);
            for (int i = 0 ; i < temp.length ; i++) {
                writer5.println(temp[i]);
            }
        }
        writer5.close();

    }
}
