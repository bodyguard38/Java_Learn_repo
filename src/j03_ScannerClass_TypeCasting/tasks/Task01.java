package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your mid-term grade: ");
        int midtermGrade = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your final grade: ");
        int finalGrade = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter your project grade: ");
        int projectGrade = Integer.parseInt(scanner.nextLine());

        double toplam= ((midtermGrade*0.30) + (finalGrade*0.20) + (projectGrade*0.50));
        System.out.println(toplam);
    }
}
