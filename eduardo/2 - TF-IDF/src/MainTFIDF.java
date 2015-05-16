/**
 * Class from  which the other classes are called
 * @author Eduardo Hernandez
 * @version 2015/05/06
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainTFIDF {

    /**
     * Main Method
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        // to read the five files with the reviews split into a word per line
        String filePath = new File("").getAbsolutePath(); // to get the path to the folder where this file is
        BufferedReader reader1 = new BufferedReader(new FileReader(filePath + "/Score1-split.txt"));
        BufferedReader reader2 = new BufferedReader(new FileReader(filePath + "/Score2-split.txt"));
        BufferedReader reader3 = new BufferedReader(new FileReader(filePath + "/Score3-split.txt"));
        BufferedReader reader4 = new BufferedReader(new FileReader(filePath + "/Score4-split.txt"));
        BufferedReader reader5 = new BufferedReader(new FileReader(filePath + "/Score5-split.txt"));

        //to write the results to a file
        PrintWriter writer1 = new PrintWriter("Score1-tfidf.txt", "UTF-8");
        PrintWriter writer2 = new PrintWriter("Score2-tfidf.txt", "UTF-8");
        PrintWriter writer3 = new PrintWriter("Score3-tfidf.txt", "UTF-8");
        PrintWriter writer4 = new PrintWriter("Score4-tfidf.txt", "UTF-8");
        PrintWriter writer5 = new PrintWriter("Score5-tfidf.txt", "UTF-8");

        List allDocuments = new ArrayList();

        ArrayList<String> d1 = new ArrayList<String>();
        ArrayList<String> d2 = new ArrayList<String>();
        ArrayList<String> d3 = new ArrayList<String>();
        ArrayList<String> d4 = new ArrayList<String>();
        ArrayList<String> d5 = new ArrayList<String>();
        String line;

        double TF, IDF;

        // read Score1-split file and put it in document1 array
        while ((line = reader1.readLine()) != null) {
            d1.add(line);
        }
        /*
        for (int i = 0 ; i < 18789*2 ; i++) {
            d1.add(line = reader1.readLine());
        }
        */
        String[] document1 = new String[d1.size()];
        for (int i = 0 ; i < d1.size() ; i++) {
            document1[i] = d1.get(i);
        }

        // read Score2-split file and put it in document2 array
        while ((line = reader2.readLine()) != null) {
            d2.add(line);
        }
        /*
        for (int i = 0 ; i < 21031*2 ; i++) {
            d2.add(line = reader2.readLine());
        }
        */
        String[] document2 = new String[d2.size()];
        for (int i = 0 ; i < d2.size() ; i++) {
            document2[i] = d2.get(i);
        }

        // read Score3-split file and put it in document3 array
        while ((line = reader3.readLine()) != null) {
            d3.add(line);
        }
        /*
        for (int i = 0 ; i < 28411*2 ; i++) {
            d3.add(line = reader3.readLine());
        }
        */
        String[] document3 = new String[d3.size()];
        for (int i = 0 ; i < d3.size() ; i++) {
            document3[i] = d3.get(i);
        }

        // read Score4-split file and put it in document4 array
        while ((line = reader4.readLine()) != null) {
            d4.add(line);
        }
        /*
        for (int i = 0 ; i < 56115*2 ; i++) {
            d4.add(line = reader4.readLine());
        }
        */
        String[] document4 = new String[d4.size()];
        for (int i = 0 ; i < d4.size() ; i++) {
            document4[i] = d4.get(i);
        }

        // read Score5-split file and put it in document5 array
        while ((line = reader5.readLine()) != null) {
            d5.add(line);
        }
        /*
        for (int i = 0 ; i < 104645*2 ; i++) {
            d5.add(line = reader5.readLine());
        }
        */
        String[] document5 = new String[d5.size()];
        for (int i = 0 ; i < d5.size() ; i++) {
            document5[i] = d5.get(i);
        }

        // Add the five files to the list that TF-IDF requires
        allDocuments.add(document1);
        allDocuments.add(document2);
        allDocuments.add(document3);
        allDocuments.add(document4);
        allDocuments.add(document5);

        // to compute the TF-IDF of every term in every file
        TFIDF compute = new TFIDF();


        for (String term : document1) {
            TF = compute.CalculateTF(document1, term);
            IDF = compute.CalculateIDF(allDocuments, term);
            writer1.println(term +" "+ TF*IDF);
        }

        for (String term : document2) {
            TF = compute.CalculateTF(document2, term);
            IDF = compute.CalculateIDF(allDocuments, term);
            writer2.println(term +" "+ TF*IDF);
        }

        for (String term : document3) {
            TF = compute.CalculateTF(document3, term);
            IDF = compute.CalculateIDF(allDocuments, term);
            writer3.println(term +" "+ TF*IDF);
        }

        for (String term : document4) {
            TF = compute.CalculateTF(document4, term);
            IDF = compute.CalculateIDF(allDocuments, term);
            writer4.println(term +" "+ TF*IDF);
        }

        for (String term : document5) {
            TF = compute.CalculateTF(document5, term);
            IDF = compute.CalculateIDF(allDocuments, term);
            writer5.println(term +" "+ TF*IDF);
        }


        /*
        System.out.println(document1.length);
        System.out.println(document2.length);
        System.out.println(document3.length);
        System.out.println(document4.length);
        System.out.println(document5.length);
        */


    }
}
