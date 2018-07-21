import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	static char[][] d;
	static int curr, count, n, m;
	static HashMap<Character, Integer> res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		sc.nextLine();
		sc.nextLine();
		for (int i = 0; i < testcase; i++) {
			ArrayList<String> data = new ArrayList<String>();
			String s = sc.nextLine();
			while (!s.contains(" ")) {
				data.add(s);
				s = sc.nextLine();
			}
			n = data.size();
			m = data.get(0).length();
			d = new char[n][m];
			for (int j = 0; j < data.size(); j++) {
				d[j] = data.get(j).toCharArray();
			}
			curr = 0;
			res = new HashMap<Character, Integer>();
			while (!s.equals("")) {
				String[] ss = s.split(" ");
				int x = Integer.parseInt(ss[0]) - 1;
				int y = Integer.parseInt(ss[1]) - 1;
				count = 0;
				if (d[x][y] != 'W') {
					System.out.println(res.get(d[x][y]));
				} else {
					explore(x, y);
					res.put((char) curr, count);
					System.out.println(count);
				}
				if (sc.hasNextLine())
					s = sc.nextLine();
				else
					break;
				curr++;
			}
			if (i != testcase - 1)
				System.out.println();
		}
		sc.close();
	}

	static void explore(int x, int y) {
		d[x][y] = (char) curr;
		count++;
		if (x > 0 && y > 0 && d[x - 1][y - 1] == 'W')
			explore(x - 1, y - 1);
		if (x > 0 && d[x - 1][y] == 'W')
			explore(x - 1, y);
		if (x > 0 && y < m - 1 && d[x - 1][y + 1] == 'W')
			explore(x - 1, y + 1);
		if (y > 0 && d[x][y - 1] == 'W')
			explore(x, y - 1);
		if (y < m - 1 && d[x][y + 1] == 'W')
			explore(x, y + 1);
		if (x < n - 1 && y > 0 && d[x + 1][y - 1] == 'W')
			explore(x + 1, y - 1);
		if (x < n - 1 && d[x + 1][y] == 'W')
			explore(x + 1, y);
		if (x < n - 1 && y < m - 1 && d[x + 1][y + 1] == 'W')
			explore(x + 1, y + 1);

	}
}
