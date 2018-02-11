import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			int n = Integer.parseInt(in.readLine());
			if (n == 0)
				break;
			int pages = (int) Math.ceil(((Math.sqrt(1 + 8 * n) - 1) / 2));
			int count = pages * (pages + 1) / 2;

			if (count == n) {
				pages++;
				sb.append(pages + " " + pages + "\n");
			} else {
				sb.append((count - n) + " " + pages + "\n");
			}
		}
		System.out.print(sb.toString());
		in.close();
	}
}
