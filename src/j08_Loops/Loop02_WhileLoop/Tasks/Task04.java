package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		*/

		int toplam = 0;

		for(int i = 100; i < 1000; i++){

			if (i % 4 == 0 && i % 6 == 0) {
				System.out.print(i + " ");
				toplam++;
			}

			
	}

}
}
