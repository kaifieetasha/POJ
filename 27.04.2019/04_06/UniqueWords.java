import java.io.*;
import java.util.*;

public class UniqueWords {

    private Scanner x;

    public void openFile(){
        try {
            x = new Scanner(new File("C:\\Users\\iwona\\IdeaProjects\\4_06\\src\\Words.txt"));
        }
        catch (Exception e) {
            System.out.println("could not find file");
        }
    }

    public void readFile(){
        ArrayList<String> list= new ArrayList<String>();
        while (x.hasNext()){
            String word = x.next();
            word = word.replace(".","");
            word = word.toLowerCase();
            if(!(list.contains(word)))
                list.add(word);

        }
        Collections.sort(list);
        int size = list.size();
        System.out.print(list +" ");
        System.out.println("\nNumber of words: " + size);
    }
    public void closeFile(){
        x.close();
    }

}
