/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 3
*/
public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3.4f, 3.6f);
        Point p2 = new Point(4.4f,4.5f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        MovablePoint mp1 = new MovablePoint(3.5f, 3.5f, 1.0f, 1.0f);

        for (int i = 0; i < 10; i++) {
            System.out.println(mp1.move());
        }
    }
}

