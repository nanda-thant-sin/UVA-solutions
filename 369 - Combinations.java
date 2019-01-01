import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger[] data = new BigInteger[101];
		data[1] = new BigInteger("1");
		for (int i = 2; i < 101; i++) {
			data[i] = new BigInteger(i + "").multiply(data[i - 1]);
		}
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0) {
				break;
			}
			System.out.println(n + " things taken " + m + " at a time is "
					+ (data[n].divide(data[n - m].multiply(data[m]))) + " exactly.");
		}
		sc.close();
	}
}
