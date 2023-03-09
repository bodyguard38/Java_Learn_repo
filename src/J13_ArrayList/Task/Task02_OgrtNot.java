package J13_ArrayList.Task;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Long.sum;



public class Task02_OgrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        while (true) {
            System.out.println("Please enter your grade: ");
            int grade = input.nextInt();
            if(grade == 0) {
                break;
            }    else {
                grades.add(grade);
            }

        }
        System.out.println("grades = " + grades);
        findAverage(grades);
        }

    private static void findAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int i:grades) {
            sum += i;
        }
        ArrayList<Integer> students = new ArrayList<>();


        int average=sum/grades.size();
        for (int i = 0; i < grades.size() ; i++) {
            if(grades.get(i) > sum/grades.size()) {
            students.add(grades.get(i));
            }
        }
        System.out.println("Total grades = " + sum);
        System.out.println("Average grades = " + average);
        System.out.println("Average number of students = " +students.size());
    }

}
