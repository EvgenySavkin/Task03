package by.it.task03.Savkin;

public class Task01 {
	public static void SumK() { // Сумма элементов массива кратных заданному K
		int i;
		int K= 3;
		int sum = 0;
		int a = 0;
		int b = 100;
		int[] mas1 = new int[10];
		for (i = 0; i < 9; i++) {
			mas1[i] = a + (int) (Math.random() * b);
			System.out.print(" " + mas1[i]);
			}
	    for (int j = 0; j < mas1.length; j++) {
	    	if ((mas1[j] % K) == 0)
	    		sum = sum+mas1[j];
	    	}
	    System.out.println("     Сумма элементов массива кратных   " + K + "  - " + sum);
	
	
	}
}
