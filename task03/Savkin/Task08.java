package by.it.task03.Savkin;

public class Task08 {
	public static void it() { // Вывести элементы для которых a[i] > i

		int[] mas = new int[] { 650, 7, 15, 2, 23, -5, 107, 7, 500, 55 };
		System.out.println();
		
		for (int j = 0; j < mas.length; j++) {
			System.out.print(" " + mas[j]);
		}
		System.out.println();
		
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] > i)
				System.out.print(" " + mas[i]);

			
		}

		
	}
}
