/**
 * Class to calculate the term frequency (TF) of a term
 * @author Eduardo Hernandez
 * @version 2015/05/06
 */

import java.util.List;

public class TFIDF {

    /**
     * Calculates the TF of term word normalized by the number of words in the document
     * @param allWordsDoc : Array of all words of the processing document
     * @param word : term of which TF is to be calculated
     * @return TF of word
     */
    public double CalculateTF(String[] allWordsDoc, String word) {
        double count = 0; //to count the number of times the term appears
        for (String s : allWordsDoc) {
            if (s.equalsIgnoreCase(word)) {
                count++;
            }
        }
        //return count / allWordsDoc.length;
        return count;
    }

    /**
     * Calculates the IDF of the term word
     * @param documents : list of the documents as arrays of strings
     * @param word: term of which IDF is to be calculated
     * @return IDF of word
     */
    public double CalculateIDF(List<String[]> documents, String word) {
        double count = 0; //to store the number of documents word appears in
        for (String[] document : documents) { //document is an array that holds a document
            for (String s : document) {
                if (s.equalsIgnoreCase(word)) {
                    count++;
                    break;
                }
            }
        }
        return 1 + Math.log(documents.size() / count);
    }

}
