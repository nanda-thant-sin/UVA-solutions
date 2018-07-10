import java.util.*;

public class Main {
	static char[][] data;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			ArrayList<String> temp = new ArrayList<String>();
			int x = 0, y = 0;
			while (!s.contains("_")) {
				temp.add(s);
				if (s.contains("*")) {
					x = temp.size() - 1;
					y = s.indexOf('*');
				}
				s = sc.nextLine();
			}
			data = new char[temp.size()][];
			for (int j = 0; j < data.length; j++) {
				data[j] = temp.get(j).toCharArray();
			}
			explore(x, y);
			for (int j = 0; j < data.length; j++) {
				sb.append(String.valueOf(data[j]) + "\n");
			}
			sb.append(s + "\n");
		}
		System.out.print(sb.toString());
		sc.close();
	}

	static void explore(int x, int y) {
		data[x][y] = '#';
		if (data[x][y - 1] == ' ')
			explore(x, y - 1);
		if (data[x][y + 1] == ' ')
			explore(x, y + 1);
		if (data[x - 1][y] == ' ')
			explore(x - 1, y);
		if (data[x + 1][y] == ' ')
			explore(x + 1, y);
	}
}
