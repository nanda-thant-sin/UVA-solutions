import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder ans = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			String s = br.readLine();
			int length = s.length();
			int max, min, curr;
			max = min = curr = length + 5;
			char[][] data = new char[length * 2 + 10][length];
			for (int j = 0; j < data.length; j++) {
				Arrays.fill(data[j], ' ');
			}
			for (int j = 0; j < length; j++) {
				if (s.charAt(j) == 'R') {
					data[curr][j] = '/';
					curr++;
				} else if (s.charAt(j) == 'F') {

					curr--;
					data[curr][j] = '\\';
				} else {
					data[curr][j] = '_';
				}
				max = Math.max(curr, max);
				min = Math.min(curr, min);
			}
			ans.append("Case #" + (i + 1) + ":\n");
			for (int j = max; j >= min; j--) {
				String temp = "| " + String.valueOf(data[j]).replaceAll("\\s+$", "");
				if (!temp.equals("| ")) {
					ans.append(temp + "\n");
				}
			}
			ans.append("+");
			for (int j = -2; j < length; j++) {
				ans.append("-");
			}
			ans.append("\n\n");
		}
		System.out.print(ans);
	}
}
