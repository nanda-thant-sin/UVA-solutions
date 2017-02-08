import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int data[][] = new int[n][n];
			int sum[][] = new int[n][n];
			int res = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					data[i][j] = sc.nextInt();
					if (i == 0 && j == 0)
						res = data[i][j];
					for (int k = i; k >= 0; k--) {
						for (int l = j; l >= 0; l--) {
							sum[k][l] = 0;
							if (k + 1 <= i && l + 1 <= j)
								sum[k][l] += sum[k + 1][l + 1];

							for (int r = k; r <= i; r++)
								sum[k][l] += data[r][l];

							for (int c = l; c <= j; c++)
								sum[k][l] += data[k][c];

							sum[k][l] -= data[k][l];
							if (sum[k][l] > res)
								res = sum[k][l];
							// System.out.println(sum[k][l]);
						}
					}
				}
			}
			System.out.println(res);
		}
	}
}
