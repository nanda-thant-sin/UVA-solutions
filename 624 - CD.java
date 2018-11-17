import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	static void printknapSack(int W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}
		int res = K[n][W];
		StringBuilder sb = new StringBuilder();
		w = W;
		for (i = n; i > 0 && res > 0; i--) {
			if (res == K[i - 1][w])
				continue;
			else {
				sb.insert(0, val[i - 1] + " ");
				res = res - val[i - 1];
				w = w - wt[i - 1];
			}
		}
		System.out.println(sb + "sum:" + K[n][W]);
	}

	public static void main(String arg[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s = br.readLine()) != null) {
			String[] ss = s.split(" ");
			int W = Integer.parseInt(ss[0]);
			int n = Integer.parseInt(ss[1]);
			int val[] = new int[n];
			int wt[] = new int[n];
			for (int i = 0; i < n; i++) {
				val[i] = wt[i] = Integer.parseInt(ss[i + 2]);
			}
			printknapSack(W, wt, val, n);
		}
	}
}
