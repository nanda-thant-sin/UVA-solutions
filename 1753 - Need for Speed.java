
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	static DecimalFormat df = new DecimalFormat("0.0000000");

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int t = sc.nextInt();
			int[] s = new int[n];
			int[] d = new int[n];
			double min = 1000, max = 10000000;
			for (int i = 0; i < n; i++) {
				d[i] = sc.nextInt();
				s[i] = sc.nextInt();
				if (s[i] < min)
					min = s[i];
			}
			min = min * -1 + 0.0000001;
			binarySearch(s, d, max, min, t);
		}
	}

	static void binarySearch(int s[], int d[], double max, double min, double t) {
		double pre = 10000001;
		while (max >= min) {
			min = Double.parseDouble(df.format(min));
			max = Double.parseDouble(df.format(max));
			double mid = min + (max - min) / 2;
			if (pre == mid)
				break;
			else
				pre = mid;
			double res = 0;
			for (int i = 0; i < s.length; i++) {
				res += d[i] / (s[i] + mid);
			}

			if (Math.abs(res - t) <= 0.0000001) {
				System.out.println(mid);
				return;
			} else if (res < t)
				max = mid + 0.0000001;
			else
				min = mid + 0.0000001;
		}
		System.out.println(Math.min(max, min) + 0.0000001);
	}
}
