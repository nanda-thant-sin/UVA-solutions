import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int q = 0; q < t; q++) {
			String[] ss;
			int n = Integer.parseInt(br.readLine());
			int[] wi = new int[n + 1];
			int[] p = new int[n + 1];
			for (int i = 1; i <= n; i++) {
				ss = br.readLine().split(" ");
				p[i] = Integer.parseInt(ss[0]);
				wi[i] = Integer.parseInt(ss[1]);
			}
			int g = Integer.parseInt(br.readLine());
			int[] each = new int[g];
			int w = 0;
			for (int i = 0; i < g; i++) {
				each[i] = Integer.parseInt(br.readLine());
				w = Math.max(w, each[i]);
			}
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
			long ans = 0;
			for (int i = 0; i < g; i++) {
				ans += item_weight[n][each[i]];
			}
			System.out.println(ans);
		}

		br.close();
	}
}
