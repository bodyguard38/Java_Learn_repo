package J24_Encapsulation.Tasks.Task_02;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinini giriniz  :");
        String name = scanner.nextLine();
        System.out.println("Yasinizi giriniz  :");
        int age = Integer.parseInt(scanner.nextLine());

        Student ogrc1 = new Student(name, age);

        System.out.println("Student name is "+ogrc1.getName()+ "\nHe is "+ogrc1.getAge()+" years old.");

        Student ogrc2 = new Student("Vedat bey",23 );
        System.out.println("ogrc2 = " + ogrc2);

    }
}
