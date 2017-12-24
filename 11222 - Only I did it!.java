import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int i = 1; i <= testcase; i++) {
			int[] solver = new int[10001];
			for (int friend = 1; friend <= 3; friend++) {
				int num_of_pro = sc.nextInt();
				for (int k = 0; k < num_of_pro; k++) {
					int num = sc.nextInt();
					if (solver[num] != 0)
						solver[num] = -1;
					else
						solver[num] = friend;
				}
			}
			int[] friend_solve = new int[3];
			StringBuilder[] sb = new StringBuilder[3];
			sb[0] = new StringBuilder();
			sb[1] = new StringBuilder();
			sb[2] = new StringBuilder();
			for (int pro = 1; pro <= 10000; pro++) {
				if (solver[pro] > 0) {
					friend_solve[solver[pro] - 1]++;
					sb[solver[pro] - 1].append(" " + pro);
				}
			}
			int max = Math.max(friend_solve[0],
					Math.max(friend_solve[1], friend_solve[2]));
			System.out.println("Case #" + i + ":");
			for (int j = 0; j < 3; j++) {
				if (friend_solve[j] == max)
					System.out.println((j + 1) + " " + max + sb[j].toString());
			}
		}
	}
}
