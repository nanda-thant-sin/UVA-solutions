import java.util.HashMap;
import java.util.Scanner;

/**
 * Idea is to store paths in HashMap. If there are more than one path available from a
 * single node, choose the destination node with the largest learning unit. Then
 * start traversing from the node 0 until there is no more node.
 * 
 * @author Nanda
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		for (int num = 1; num <= testcase; num++) {
			int node = sc.nextInt();
			int edge = sc.nextInt();
			int[] LearningUnitForNode = new int[node];
			for (int index = 0; index < node; index++) {
				LearningUnitForNode[index] = sc.nextInt();
			}
			HashMap<Integer, Integer> bestPath = new HashMap<Integer, Integer>();
			for (int e = 0; e < edge; e++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				if (bestPath.containsKey(start)) {
					if (LearningUnitForNode[end] > LearningUnitForNode[bestPath
							.get(start)]) {
						bestPath.put(start, end);
					}
				} else {
					bestPath.put(start, end);
				}
			}
			int currentNode = 0, total = 0;
			while (bestPath.containsKey(currentNode)) {
				int now = bestPath.get(currentNode);
				total += LearningUnitForNode[now];
				currentNode = now;
			}
			System.out
					.println("Case " + num + ": " + total + " " + currentNode);
		}
		sc.close();
	}
}
