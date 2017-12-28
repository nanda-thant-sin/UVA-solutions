import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		br.readLine();
		for (int i = 1; i <= testcase; i++) {
			System.out.println("Case #" + i + ":");
			while (true) {
				String line = br.readLine();
				// if line is blank, starts new test case
				if (line.equals(""))
					break;
				String[] s = line.split(" ");
				int index = 0;
				for (int j = 0; j < s.length; j++) {
					if (s[j].length() > index) {
						System.out.print(s[j].charAt(index++));
					}
				}
				System.out.println();
			}
			// print blank line between test cases
			if (testcase != i)
				System.out.println();
		}
	}
}
