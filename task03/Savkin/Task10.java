package by.it.task03.Savkin;

public class Task10 {
public static void sort(int[]mas) {   // ����� �������� �� a[i] + a[n-i]   ��� n - ���������� ���������
		
		int i = 0;
		int j = mas.length - 1;
		int max = mas[i] + mas [j];
		while ( i < (j - i)) {
			if (max < (mas[i] + mas [j-i]) ) {
				max = mas[i] + mas [j-i];
				i ++ ;
			}
			i++;
		}
		System.out.println(max);
	}
}
