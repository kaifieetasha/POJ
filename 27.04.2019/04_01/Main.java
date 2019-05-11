/*
POJ - laboratorium 4 2019-04-27
Grupa: Maciej Rybacki i Iwona Rymanowska
Zadanie 1
*/
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Iwona", "Sezamkowa 16");
        Person p2 = new Person("Maciej", "Fiołkowa 3/3");
        Staff s1 = new Staff("Autonomik",1200,"Adam","Rycersa 8");
        Student st1 = new Student("Adam","Szkolna 3","Biology",3,650);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(s1.toString());
        System.out.println(st1.toString());
    }
}
