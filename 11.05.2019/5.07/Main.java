/*
Zadanie nr7 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeStatistics gs = new GradeStatistics();

        System.out.print("Enter the number of students: ");
        int studentsNumber = scanner.nextInt();
        for (int i=1; i <= studentsNumber; ++i){
            System.out.print("Enter the grade for student: " + i + ": ");
            gs.AddGrade(scanner.nextInt());
        }
        System.out.println("The grades are: " + gs.getGrades());
        try {
            System.out.format("%.2f\n", gs.calcAverage());
            System.out.format("%.2f\n", gs.calcMedian());
            System.out.format("%d\n", gs.calcMinimum());
            System.out.format("%d\n", gs.calcMaximum());
            System.out.format("%.2f\n", gs.calcStandardDeviation());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
};