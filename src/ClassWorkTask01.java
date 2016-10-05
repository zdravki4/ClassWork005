/*
 Напишете задача, която отпечатва на екрана всички нечетни 
числа от 1 до n (въвежда се от клавиатурата), използвайки цикъла while.
*/

import java.util.Scanner;

public class ClassWorkTask01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, enter an integer number: ");
		int userInput = input.nextInt();
		
		for (int i = 0; i < userInput; i++) {
			if (i % 2 != 0) {
				System.out.println("Odd number: " + i);
			}
			
		}
	}

}
