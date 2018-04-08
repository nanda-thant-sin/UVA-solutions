import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int total = 2 * k * n;
			int[] battery = new int[total];
			for (int i = 0; i < 2 * n * k; i++) {
				battery[i] = sc.nextInt();
			}
			Arrays.sort(battery);
			int l = battery[1] - battery[0];
			int r = battery[total - 1] - battery[0];
			int mid;
			int res = r;
			while (l <= r) {
				mid = (l + r) / 2;
				int found = 0;
				for (int i = 0; i < total - 1; i++) {
					if (battery[i + 1] - battery[i] <= mid) {
						found++;
						i++;
					}
					if (found == n || i >= found * k * 2) {
						break;
					}
				}
				if (found == n) {
					res = mid;
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			System.out.println(res);
		}
		sc.close();
	}

}
