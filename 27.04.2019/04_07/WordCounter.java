/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 7
*/
import java.util.*;
import java.io.*;

public class WordCounter {
    private String sentence;
    private Scanner x;

   // public WordCounter(String _sentence) {
  //      sentence = _sentence;
  //  }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void openFile(){
        try {
            x = new Scanner(new File("/Users/levar/IdeaProjects/03_07/src/Words.txt"));
        }
        catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readFile(){
        sentence = x.nextLine();
    }



    public void closeFile (){
        x.close();
    }

    public String prepareSentence () {
        sentence = getSentence();
        sentence = sentence.replace(",", "");
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(".", " ");
        sentence = sentence.replace("\n", " ");
        sentence = sentence.toLowerCase();
        setSentence(sentence);
        getSentence();
        return getSentence();
    }

    public Map <String, Integer> Spliter(String sentence) {
        Map<String, Integer> Count = new TreeMap<String, Integer>();
        String [] splitedSentence = sentence.split(" ");

        for (int i = 0; i < splitedSentence.length; i++) {
            if (Count.containsKey(splitedSentence[i])) {
                Count.put(splitedSentence[i], Count.get(splitedSentence[i])+1);
            }
            else {
                Count.put(splitedSentence[i], 1);
            }
        }
        return Count;
    }


    public void Writer (Map<String, Integer> Count) {
        System.out.print("[");
        for (Map.Entry<String, Integer> entry : Count.entrySet()){
            if(entry.getValue() != 0) System.out.print(entry.getKey()+"="+entry.getValue()+", ");
        }
        System.out.print("]");
    }

    public void ExecuteAll () {
        this.sentence = sentence;
        Writer(Spliter(prepareSentence()));
    }
}

