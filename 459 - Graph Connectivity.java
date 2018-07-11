import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean[] visited;
	static ArrayList<Integer>[] adj;

	private static int numberOfComponents() {
		visited = new boolean[adj.length];
		int count = 0;
		for (int i = 0; i < adj.length; i++) {
			if (!visited[i]) {
				count++;
				explore(i);
			}
		}
		return count;
	}

	private static void explore(int x) {
		visited[x] = true;
		for (int i = 0; i < adj[x].size(); i++) {
			if (!visited[adj[x].get(i)]) {
				explore(adj[x].get(i));
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testcase = scanner.nextInt();
		scanner.nextLine();
		scanner.nextLine();
		for (int i = 0; i < testcase; i++) {
			char max = scanner.nextLine().charAt(0);
			int num_of_node = max - 'A' + 1;
			adj = (ArrayList<Integer>[]) new ArrayList[num_of_node];
			for (int j = 0; j < num_of_node; j++) {
				adj[j] = new ArrayList<Integer>();
			}
			String edge;
			while (scanner.hasNextLine() && !(edge = scanner.nextLine()).equals("")) {
				int x, y;
				x = edge.charAt(0) - 'A' + 1;
				y = edge.charAt(1) - 'A' + 1;
				adj[x - 1].add(y - 1);
				adj[y - 1].add(x - 1);
			}
			System.out.println(numberOfComponents());
			if (i != testcase - 1)
				System.out.println();
		}
	}
}
