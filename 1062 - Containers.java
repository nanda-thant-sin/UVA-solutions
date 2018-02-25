import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int caseNo = 1;
		while (true) {
			String s = br.readLine();
			if (s.equals("end")) {
				break;
			}
			char[] data = new char[26];
			int curr = 0;
			for (int i = 0; i < s.length(); i++) {
				char temp = s.charAt(i);
				int j = 0;
				for (; j < curr; j++) {
					if (data[j] >= temp) {
						data[j] = temp;
						break;
					}
				}
				if (j == curr) {
					data[curr] = temp;
					curr++;
				}
			}
			sb.append("Case " + (caseNo++) + ": " + curr + "\n");
		}
		System.out.print(sb.toString());
	}
}
