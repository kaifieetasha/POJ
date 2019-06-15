// 25.05.2019 r, Lab6. Zad3.
// Adrian Szostak, s19777
// Iwona Rymanowska s19330

import java.util.Scanner;

public final class UseInsurance {

    private static int input;
    private static Health health;
    private static Life life;

    public static void main(String[] args) {

        menu();
        printInsurance(input);

    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Witamy w ubezpieczalni 'Żyj Krótko'. Wybierz interesujący Cię pakiet: " +
                "\n1 -> Ubezpieczenie zdrowia " +
                "\n2 -> Ubezpieczenie życia " +
                "\nWybrałeś: ");

        input = scanner.nextInt();

        switch (input) {
            case 1: {
                health = new Health();
                break;
            }
            case 2: {
                life = new Life();
                break;
            }
        }

        return input;
    }

    private static void printInsurance(int input) {

        if (input == 1) {
            health.display();
        } else if (input == 2) {
            life.display();
        }
    }

}