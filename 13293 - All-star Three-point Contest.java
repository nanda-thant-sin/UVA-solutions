import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		int testcase = 1;
		StringBuilder sb = new StringBuilder();
		while ((s = br.readLine()) != null) {
			int n = Integer.parseInt(s);
			List<Player> data = new ArrayList<Player>();
			for (int i = 0; i < n; i++) {
				data.add(new Player(br.readLine()));
			}
			Collections.sort(data, Comparator.comparing(Player::getMark).reversed().thenComparing(Player::getName,
					String.CASE_INSENSITIVE_ORDER));
			sb.append("Case " + testcase + ":\n");
			for (Player p : data) {
				sb.append(p.getName() + " " + p.getMark() + "\n");
			}
			testcase++;
		}
		System.out.print(sb);
	}
}

class Player {
	private String name;
	private int mark;

	public Player(String line) {
		String[] data = line.split(";");
		this.name = data[0];
		for (int i = 1; i < 6; i++) {
			data[i] = data[i].trim();
			this.mark += data[i].charAt(0) + data[i].charAt(2) + data[i].charAt(4) + data[i].charAt(6)
					+ 2 * data[i].charAt(8) - 6 * '0';
		}
	}

	public String getName() {
		return name;
	}

	public int getMark() {
		return mark;
	}
}
