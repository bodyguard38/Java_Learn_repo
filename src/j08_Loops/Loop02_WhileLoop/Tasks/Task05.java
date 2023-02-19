package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner input = new Scanner(System.in);
		System.out.println("input your name and surname");
		String name= input.nextLine();

		int ch=0;
		while (ch<name.length()) {
			System.out.print(name.charAt(ch)+" ");
			ch++;
		}
			

	}

}
