import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr1[] = new int[a];
		int arr2[] = new int[b];
		int c = a + b;

		for (int i = 0; i < a; i++)
			arr1[i] = scan.nextInt();

		for (int i = 0; i < b; i++)
			arr2[i] = scan.nextInt();

		int arr3[] = new int[c];
		int temp = a;

		int a1 = 0;
		int b1 = 0;

		if (a < b)
			temp = a;
		else
			temp = b;

		int i = 0;

		while (i < c) {

			if (a1 < a && b1 < b) {
				if (arr1[a1] < arr2[b1]) {
					arr3[i] = arr1[a1];
					a1 = a1 + 1;
				}
			}

			else {
				arr3[i] = arr2[b1];
				b1 = b1 + 1;

			}
			i = i + 1;
		}

		for (i = 0; i < temp; i++)
			System.out.print(arr3[i]);

	}
}
