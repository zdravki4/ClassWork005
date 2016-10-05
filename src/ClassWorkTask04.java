/*Направете програма, която извежда на 
конзолата всички числа от 1 до 100, които 
се делят или на 7, или на 11, без остатък.*/

public class ClassWorkTask04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			if (i % 7 ==0 || i % 11 ==0) {
				System.out.println(i);
			}
			
		}

	}

}
