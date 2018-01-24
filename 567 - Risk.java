import java.util.*;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcase = 1;
		while (sc.hasNext()) {
			System.out.println("Test Set #" + (testcase++));
			int[] index = new int[20];
			int[][] link = new int[20][20];
			for (int i = 0; i < 19; i++) {
				int x = sc.nextInt();
				for (int j = 0; j < x; j++) {
					int curr = sc.nextInt() - 1;
					link[i][index[i]++] = curr;
					link[curr][index[curr]++] = i;
				}
			}
			int q = sc.nextInt();
			for (int i = 0; i < q; i++) {
				int start = sc.nextInt() - 1;
				int end = sc.nextInt() - 1;
				boolean[] isChecked = new boolean[20];
				isChecked[start] = true;
				Stack<Integer> current = new Stack<Integer>();
				current.push(start);
				boolean found = false;
				int ans = 0;
				while (!found) {
					Stack<Integer> newLevel = new Stack<Integer>();
					ans++;
					while (!current.isEmpty()) {
						int temp = current.pop();
						for (int k = 0; k < index[temp]; k++) {
							if (link[temp][k] == end) {
								found = true;
								break;
							} else if (!isChecked[link[temp][k]]) {
								newLevel.push(link[temp][k]);
								isChecked[link[temp][k]] = true;
							}
						}
						if (found)
							break;
					}
					current = newLevel;
				}
				System.out.format("%2d to %2d: %d\n", start + 1, end + 1, ans);
			}
			System.out.println();
		}
		sc.close();
	}
}
