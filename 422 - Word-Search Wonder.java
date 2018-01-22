import java.util.*;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 }, { -1, -1 },
				{ 1, -1 }, { -1, 1 }, { 1, 1 } };
		int n = sc.nextInt();
		char[][] c = new char[n][n];
		for (int i = 0; i < n; i++) {
			c[i] = sc.next().toCharArray();
		}
		while (true) {
			String s = sc.next();
			boolean found = false;
			if (s.equals("0")) {
				break;
			}
			int i = 0, j = 0, k = 0;
			for (i = 0; i < n; i++) {
				for (j = 0; j < n; j++) {
					if (s.charAt(0) == c[i][j]) {
						for (k = 0; k < 8; k++) {
							found = search(i, j, s, dir[k][0], dir[k][1], c, n);
							if (found)
								break;
						}
					}
					if (found)
						break;
				}
				if (found)
					break;
			}
			if (found) {
				System.out.println((i + 1) + "," + (j + 1) + " "
						+ (i + 1 + dir[k][0] * (s.length() - 1)) + ","
						+ (j + 1 + dir[k][1] * (s.length() - 1)));
			} else {
				System.out.println("Not found");
			}
		}
		sc.close();
	}

	static boolean search(int i, int j, String s, int x, int y, char[][] c,
			int n) {
		boolean found = true;
		for (int q = 1; q < s.length(); q++) {
			i += x;
			j += y;
			if (!(i >= 0 && i < n && j >= 0 && j < n && s.charAt(q) == c[i][j])) {
				found = false;
				break;
			}

		}
		return found;
	}
}
