package by.it.task03.Savkin;

public class Enter {                           // формируем массив случайными числами размерностью n
	public static int[] ent(int n) {
		int[] mas3 = new int[n];
		for (int i = 0; i < mas3.length; i++) {
			mas3[i] = -50 + (int) (Math.random() * 100);
			System.out.print(" " + mas3[i]);

		}
		return mas3;

	}
}
