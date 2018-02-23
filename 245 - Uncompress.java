import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		ArrayList<String> data = new ArrayList<String>();
		while (true) {
			String s = br.readLine();
			String word = "";
			if (s.equals("0")) {
				break;
			}
			for (int i = 0; i < s.length();) {
				StringBuilder curr = new StringBuilder("");
				char c = s.charAt(i);
				if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
					curr.append(c);
					while (true) {
						i++;
						if (i == s.length()) {
							break;
						}
						c = s.charAt(i);
						if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
							curr.append(c);
						} else {
							break;
						}
					}
					word = curr.toString();
					data.add(0, word);
				} else if (c >= '0' && c <= '9') {
					int num = c - '0';
					while (true) {
						i++;
						if (i == s.length()) {
							break;
						}
						c = s.charAt(i);
						if (c >= '0' && c <= '9') {
							num = num * 10 + c - '0';
						} else {
							break;
						}
					}
					word = data.remove(num - 1);
					data.add(0, word);
				} else {
					curr.append(c);
					while (true) {
						i++;
						if (i == s.length()) {
							break;
						}
						c = s.charAt(i);
						if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
							curr.append(c);
						} else {
							break;
						}
					}
					word = curr.toString();
				}
				sb.append(word);
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
