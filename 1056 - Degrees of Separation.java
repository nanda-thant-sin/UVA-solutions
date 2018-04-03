import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int testcase = 1;
		while (true) {
			int p = sc.nextInt();
			int r = sc.nextInt();
			if (p == 0)
				break;
			int count = 0;
			int[][] mapping = new int[p][p];
			for (int i = 0; i < p; i++) {
				Arrays.fill(mapping[i], 100);
			}
			HashMap<String, Integer> data = new HashMap<String, Integer>();
			for (int i = 0; i < r; i++) {
				String a = sc.next();
				String b = sc.next();
				int index_a = 0;
				int index_b = 0;
				if (data.get(a) != null) {
					index_a = data.get(a);
				} else {
					data.put(a, count);
					index_a = count++;
				}
				if (data.get(b) != null) {
					index_b = data.get(b);
				} else {
					data.put(b, count);
					index_b = count++;
				}
				mapping[index_a][index_b] = mapping[index_b][index_a] = 1;
			}
			for (int i = 0; i < p; i++) {
				for (int j = 0; j < p; j++) {
					for (int k = 0; k < p; k++) {
						if (mapping[i][k] + mapping[j][i] <= mapping[j][k]) {
							mapping[j][k] = mapping[i][k] + mapping[j][i];
							mapping[k][j] = mapping[i][k] + mapping[j][i];
						}

					}
				}
			}
			int result = -1;
			for (int i = 0; i < p; i++) {
				for (int j = i + 1; j < p; j++) {
					result = Math.max(mapping[i][j], result);
				}
			}
			sb.append("Network " + (testcase++) + ": ");
			if (result >= 100)
				sb.append("DISCONNECTED\n\n");
			else
				sb.append(result + "\n\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}
}
