package by.it.task03.Savkin;

public class Task09 {
	public static void Otr() { // Посчитать в массиве размерностью N количство положительных, отрицательных, и
		// нулевых элементов
		int n = 15;
		int a = -50;
		int b = 100;
		int Ot = 0;
		int pl = 0;
		int nl = 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a + (int) (Math.random() * b);
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] < 0) {
				Ot = Ot + 1;
			}
			if (arr[j] > 0) {
				pl = pl + 1;
			}
			if (arr[j] == 0) {
				nl = nl + 1;
			}

		}
		System.out.println();
		System.out.println(" количество положительных элементов: " + pl);
		System.out.println(" количество отрицательных элементов: " + Ot);
		System.out.println(" количество нулевых элементов: " + nl);

	}
}
