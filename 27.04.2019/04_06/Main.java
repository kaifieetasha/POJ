/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 6
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        UniqueWords r = new UniqueWords();
        r.openFile();
        r.readFile();
        r.closeFile();
    }
}