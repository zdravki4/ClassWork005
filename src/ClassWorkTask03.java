/*�������� ��������, ����� ���� �����������
�� ������� ����� � �� ������. ���� �� ���������� 
��������, ���������� ������ ����������� ������ ������� 0.*/


import java.util.Scanner;

public class ClassWorkTask03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter few numbers: ");
		int numbers = input.nextInt();
		
		int sum = 0;
		while (numbers != 0) {
			
			sum += numbers;
			numbers = input.nextInt();
		}
		System.out.println(sum);	

	}

}
