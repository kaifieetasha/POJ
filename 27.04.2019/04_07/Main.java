/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 7
*/
public class Main {

    public static void main(String[] args) {
        WordCounter sentence = new WordCounter("This is some sample text. Some text is sampled\n" +
                "for this purpose, but this text is merely a\n" +
                "sample.");
        sentence.ExecuteAll();
    }
}

