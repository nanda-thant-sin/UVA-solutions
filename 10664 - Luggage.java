import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int q = 0; q < t; q++) {
			String[] ss = br.readLine().split(" ");
			int n = ss.length;
			int[] wi = new int[n + 1];
			int[] p = new int[n + 1];
			int w = 0;
			for (int i = 1; i <= n; i++) {
				p[i] = Integer.parseInt(ss[i - 1]);
				wi[i] = Integer.parseInt(ss[i - 1]);
				w += p[i];
			}
			if (w % 2 != 0) {
				sb.append("NO\n");
			} else {
				w /= 2;
				int[][] item_weight = new int[n + 1][w + 1];
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= w; j++) {
						if (j >= wi[i]) {
							item_weight[i][j] = Math.max(p[i] + item_weight[i - 1][j - wi[i]], item_weight[i - 1][j]);
						} else {
							item_weight[i][j] = item_weight[i - 1][j];
						}
					}
				}
				if (item_weight[n][w] == w) {
					sb.append("YES\n");
				} else {
					sb.append("NO\n");
				}
			}
		}
		System.out.print(sb);
		br.close();
	}
}
