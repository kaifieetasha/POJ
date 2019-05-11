/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 7
*/
public class Main {

    public static void main(String[] args) {
        WordCounter sentence = new WordCounter();
        sentence.openFile();
        sentence.readFile();
        sentence.closeFile();
        sentence.ExecuteAll();
    }
}

