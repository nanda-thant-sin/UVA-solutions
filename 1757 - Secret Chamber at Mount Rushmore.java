import java.util.*;

public class Main {
	static boolean[] alreadyVisited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			boolean[][] map = new boolean[26][26];
			for (int i = 0; i < m; i++) {
				int a = sc.next().charAt(0);
				int b = sc.next().charAt(0);
				map[a - 'a'][b - 'a'] = true;
			}
			for (int i = 0; i < n; i++) {
				String first = sc.next();
				String second = sc.next();
				if (first.length() != second.length()) {
					System.out.println("no");
				} else {
					boolean isCorrect = true;
					for (int j = 0; j < first.length() && isCorrect; j++) {
						if (first.charAt(j) != second.charAt(j)) {
							alreadyVisited = new boolean[26];
							alreadyVisited[first.charAt(j) - 'a'] = true;
							isCorrect = dfs(map, first.charAt(j) - 'a', second.charAt(j) - 'a');
						}
					}
					if (isCorrect)
						System.out.println("yes");
					else
						System.out.println("no");

				}
			}
		}
	}

	static boolean dfs(boolean[][] map, int first, int second) {
		boolean isPossible = false;
		for (int i = 0; i < 26 && !isPossible; i++) {
			if (!alreadyVisited[i] && map[first][i]) {
				if (i == second) {
					return true;
				} else {
					alreadyVisited[i] = true;
					isPossible = dfs(map, i, second);
				}
			}
		}
		return isPossible;
	}
}
