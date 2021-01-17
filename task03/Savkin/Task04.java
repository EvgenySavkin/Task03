package by.it.task03.Savkin;

public class Task04 {
	public static void Chet(int[]mas) { // Формирует массив из четных элементов из заданного
		int b = 0;
		int c = 0;
		
		c = mas.length;
		int[] mas2 = new int[c];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % 2 == 0) {
				mas2[b] = mas[i];
				b = b + 1;
			}
		}

		if (b == 0)
			System.out.println(" В исходном массиве нет четных чисел");

		for (int j = 0; j < b; j++) {
			System.out.print(" " + mas2[j]);
		}
	}
}
