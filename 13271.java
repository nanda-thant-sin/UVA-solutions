import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] s = br.readLine().split(" ");
			int sr = Integer.parseInt(s[0]);
			int sc = Integer.parseInt(s[1]);
			int dr = Integer.parseInt(s[2]);
			int dc = Integer.parseInt(s[3]);
			int r_diff = Math.abs(dr - sr);
			int c_diff = Math.abs(dc - sc);
			if (sr == 0)
				break;
			if (r_diff <= c_diff) {
				System.out.println(r_diff + c_diff);
			} else {
				if (sr > dr) {
					int temp = sr;
					sr = dr;
					dr = temp;
					temp = sc;
					sc = dc;
					dc = temp;
				}
				int total = 0;
				if (sr % 2 == sc % 2) {
					total++;
					sr++;
				}
				total += Math.abs(sc - dc) * 2;
				if (sc > dc) {
					sr += sc - dc;
				} else {
					sr -= sc - dc;
				}
				sc = dc;
				int odd_count = 0;
				int even_count = 0;
				odd_count += (dr - sr) / 2;
				even_count = odd_count;
				if (odd_count + even_count != dr - sr) {
					if (sr % 2 == 0)
						even_count++;
					else
						odd_count++;
				}
				if (sc % 2 == 0) {
					total += 3 * odd_count + even_count;
				} else {
					total += odd_count + 3 * even_count;
				}
				System.out.println(total);
			}
		}
	}
}
