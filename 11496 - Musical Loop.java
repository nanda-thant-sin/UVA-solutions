import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;
			int[] d = new int[n + 2];
			for (int i = 0; i < n; i++)
				d[i] = sc.nextInt();
			d[n] = d[0];
			d[n + 1] = d[1];
			boolean up = false;
			int res = 0;
			if (d[1] > d[0])
				up = true;
			for (int i = 2; i < n + 2; i++) {
				if (up && d[i] < d[i - 1]) {
					res++;
					up = false;
				} else if (!up && d[i] > d[i - 1]) {
					res++;
					up = true;
				}
			}
			System.out.println(res);
		}
	}
}
