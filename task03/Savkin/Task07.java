package by.it.task03.Savkin;

public class Task07 {                                   // меняем местами макс и мин элементы
	public static int[] Replace(int[] mas) {
		int max = mas[0];
		int min = mas[1];
		int temp = 0;
		int M = 0;
		int m = 0;
		for (int i = 1; i < mas.length; i++) {
			if (mas[i] >= max) {
				max = mas[i];
				M = i;
			} else {
				min = mas[i];
				m = i;
			}
		}
		temp = mas[M];
		mas[M] = mas[m];
		mas[m] = temp;
		return mas;
	}
}
