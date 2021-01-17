package by.it.task03.Savkin;

public class Task02 {
	public static void Nelem() { // Вывести номера нулевых элементов массива

		int i;
		int[] mas1 = new int[] { 15, 0, 9, 58, 6, 0, 99, 3, 0, 0 };
		System.out.print(" Исходный массив:    ");
		for (int j = 0; j < mas1.length; j++) {
			System.out.print(" " + mas1[j]);
		}
		System.out.println();
		System.out.print(" Номера нулевых элементов:  ");
		for (i = 0; i < mas1.length; i++) {
			if (mas1[i] == 0)
				System.out.print(" " + i);

		}
		System.out.println();
	}
}
