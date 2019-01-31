import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] res = new int[101][101];
		int index = 0;
		HashMap<Integer, Integer> ii = new HashMap<>();
		for (int i = 2; i < 101; i++) {
			int temp = i;
			int curr = 2;
			while (temp != 1) {
				while (temp % curr == 0) {
					if (!ii.containsKey(curr)) {
						ii.put(curr, index++);
					}
					res[i][ii.get(curr)]++;
					temp /= curr;
				}
				curr++;
			}
			for (int j = 0; j < index; j++) {
				res[i][j] += res[i - 1][j];
			}
		}
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.printf("%3d! =", n);
			for (int i = 0; i < 100; i++) {
				if (res[n][i] != 0 && i != 0 && i % 15 == 0)
					System.out.printf("\n      %3d", res[n][i]);
				else if (res[n][i] != 0)
					System.out.printf("%3d", res[n][i]);
			}
			System.out.println();
		}
		sc.close();
	}
}
