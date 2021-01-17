package by.it.task03.Savkin;

public class Task06 {               // Дана последовательность, заменить все числа большие данного Z на это число, посчитать количество замен 
	public static void Zam() {
		int n = 15;
		int a = -50;
		int b = 100;
		int Z = 5;
		int s= 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a + (int) (Math.random() * b);
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		for (int j = 0; j < arr.length; j ++) {
			if (arr[j] < Z) {
				arr[j] = Z ;
				s = s + 1 ;
				System.out.print( " " + arr[j]);
			}
			else {
			System.out.print(" " + arr[j]);
		}
			
			}
		System.out.println();
		System.out.print(" количество замен: " + s);

	}


}
