import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			Set<String> ans = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				Node curr = null;
				for (int j = 0; j < k; j++) {
					int v = sc.nextInt();
					if (curr == null) {
						curr = new Node(v);
					} else {
						curr.add(v);
					}
				}
				ans.add(curr.traverse(2));
			}
			System.out.println(ans.size());
		}
		sc.close();
	}
}

class Node {
	int value = 0;
	Node left = null;
	Node right = null;

	Node(int value) {
		this.value = value;
	}

	void add(int v) {
		if (v < value) {
			if (left == null) {
				left = new Node(v);
			} else {
				left.add(v);
			}
		} else {
			if (right == null) {
				right = new Node(v);
			} else {
				right.add(v);
			}
		}
	}

	String traverse(int value) {
		StringBuilder sb = new StringBuilder();
		if (left != null) {
			sb.append(" " + left.traverse(1) + " ");
		} else {
			sb.append(" ");
		}
		sb.append(value);
		if (right != null) {
			sb.append(" " + right.traverse(3) + " ");
		} else {
			sb.append(" ");
		}
		return sb.toString();
	}
}
