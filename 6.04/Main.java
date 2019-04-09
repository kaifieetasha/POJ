import model.Date;
import model.Employee;
import palindrome.Palindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Rafał Sochacki s20047
 * @author Iwona Rymanowska s19330
 * <p>
 * Main class of the application
 */

public class Main {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        System.out.println("For printing Employees type -> 1 " +
                "\nFor check palindrome type -> 2");

        int choose = scanner.nextInt();

        switch (choose) {
            case 1:
                printEmplyees();
                break;
            case 2:
                checkPalindrome();
                break;
        }

    }

    public static void printEmplyees() {


        //-------------------------- 1st way of adding employess to an ArrayList ---------------------------------------

//        Employee employee1 = new Employee(0, "Iwona", "Rymanowska", 1200, new Date(12, 12, 2012));
//        Employee employee2 = new Employee(1, "Rafał", "Sochacki", 1300, new Date(12, 03, 2011));
//        Employee employee3 = new Employee(2, "Gregor", "Clegane", 1400, new Date(12, 12, 2012));
//        Employee employee4 = new Employee(3, "Khal", "Drogo", 1500, new Date(12, 12, 2012));
//        Employee employee5 = new Employee(4, "Cersei", "Lannister", 1600, new Date(12, 12, 2012));
//        Employee employee6 = new Employee(5, "Sandor", "Clegane", 1700, new Date(12, 12, 2012));
//        Employee employee7 = new Employee(6, "Tyrion", "Lannister", 1800, new Date(12, 12, 2012));
//        Employee employee8 = new Employee(7, "Piotruś", "Pan", 1900, new Date(12, 12, 2012));
//
//        ArrayList employeesList = new ArrayList<>();
//
//        employeesList.add(employee1);
//        employeesList.add(employee2);
//        employeesList.add(employee3);
//        employeesList.add(employee4);
//        employeesList.add(employee5);
//        employeesList.add(employee6);
//        employeesList.add(employee7);
//        employeesList.add(employee8);
//
//        for (Object employee : employeesList){
//            System.out.println(employee);
//        }


        //-------------------------- 2nd way of adding employees to an ArrayList ---------------------------------------

        ArrayList employeesList = new ArrayList<>(Arrays.asList(
                new Employee(0, "Iwona", "Rymanowska", 1200, new Date(12, 12, 2012)),
                new Employee(1, "Rafał", "Sochacki", 1300, new Date(12, 03, 2011)),
                new Employee(2, "Gregor", "Clegane", 1400, new Date(12, 12, 2012)),
                new Employee(2, "Gregor", "Clegane", 1400, new Date(12, 12, 2012)),
                new Employee(4, "Cersei", "Lannister", 1600, new Date(12, 12, 2012)),
                new Employee(5, "Sandor", "Clegane", 1700, new Date(12, 12, 2012)),
                new Employee(6, "Tyrion", "Lannister", 1800, new Date(12, 12, 2012)),
                new Employee(7, "Piotruś", "Pan", 1900, new Date(12, 12, 2012))
        ));

        employeesList.forEach(employee -> System.out.println(employee.toString()));
    }

    public static void checkPalindrome() {
        Palindrome Pali1 = new Palindrome();
        Pali1.setPalindrome("Atak kata.");
        Palindrome Pali2 = new Palindrome();
        Pali2.setPalindrome("Muzo, raz daj jad za rozum");
        Palindrome Pali3 = new Palindrome();
        Pali3.setPalindrome("Wódy żal dla żydów");


        System.out.println(Pali1.Checking());
        System.out.println(Pali2.Checking());
        System.out.println(Pali3.Checking());

    }
}
