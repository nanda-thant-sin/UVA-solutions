import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			String[] data = s.split(" ");
			int l = Integer.parseInt(data[0]);
			int w = Integer.parseInt(data[1]);
			double h = Integer.parseInt(data[2]);
			int theta = Integer.parseInt(data[3]);
			double curr_height = Math.tan(Math.toRadians(theta)) * l;
			if (curr_height <= h) {
				System.out.printf("%.3f mL\n", l * w * h - (Math.tan(Math.toRadians(theta)) * 0.5 * l * l * w));
			} else {
				System.out.printf("%.3f mL\n", Math.tan(Math.toRadians(90 - theta)) * 0.5 * h * h * w);
			}
		}
	}
}
