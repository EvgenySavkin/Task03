package by.it.task03.Savkin;

public class Task03 {

	public static void Vozr(int[] a) { // ѕроверить возврастающа€ ли это последовательность
		String n = " ";

		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		int j = 0;
		while (j < a.length - 1) {
			if (a[j] < a[j + 1]) {
				j++;
			} else {
				n = "не";
				break;
			}

		}
		System.out.println();
		System.out.println("ѕоследовательность " + n + " возрастающа€");

	}
}
