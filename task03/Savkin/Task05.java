package by.it.task03.Savkin;

public class Task05 {
	public static void Dl() { // Минимальная длинна числовой оси

		int[] mas = new int[] { 650, 7, 15, 11, 23, 11, 107, 7, 500, 55 };
		System.out.println();
		int min = mas[0];
		int max = mas[0];
		for (int j = 0; j < mas.length; j++) {
			System.out.print(" " + mas[j]);
		}
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] < min)
				min = mas[i];

			if (mas[i] > max)
				max = mas[i];
		}

		int res = max - min;
		System.out.println();
		System.out.print(" Минимальная длинна числовой оси " + res);

	}

}
