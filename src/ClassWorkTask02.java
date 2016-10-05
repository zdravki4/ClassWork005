/*
Напишете програма, която приема две числа N и M.
Програмата трябва да пресметне колко е N на степен М.
*/

import java.util.Scanner;

public class ClassWorkTask02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int s =1;
		for(int i = 1; i <= m; i++){
		    s *= n;
		}
		System.out.println(s);
	}

}
