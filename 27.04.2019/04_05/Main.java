/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 5
*/
public class Main {

    public static void main(String[] args) {
        Armstrong number1 = new Armstrong(153);
        Armstrong number2 = new Armstrong(123);

        System.out.println(number1.Armstrong());
        System.out.println(number2.Armstrong());
    }
}

