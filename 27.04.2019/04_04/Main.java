/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 4
*/
public class Main {

    public static void main(String[] args) {

        Shape p1 = new Shape("green",true);
        Circle c2 = new Circle(1.0,"red",true);
        Rectangle r1 = new Rectangle(1.0,3.5,"orange",true);
        Square s1 = new Square(4.5,"yellow",true);

        System.out.println(p1.toString());
        System.out.println(c2.toString());
        System.out.println(r1.toString());
        System.out.println(s1.toString());
    }
}
