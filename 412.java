import java.math.BigInteger;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data;
		int count;
		int total;
		while (n != 0) {
			data = new int[n];
			count = 0;
			if (n == 2)
				total = 1;
			else {
				total = n * (n / 2 - 1);
				if (n % 2 == 0)
					total += n / 2;
				else
					total += n;
			}
			for (int i = 0; i < n; i++) {
				data[i] = sc.nextInt();
				for (int j = i - 1; j >= 0; j--) {
					int res=BigInteger.valueOf(data[i]).gcd(BigInteger.valueOf(data[j])).intValue();
					if(res==1)count++;
				}
			}
			if (count == 0)
				System.out.println("No estimate for this data set.");
			else
				System.out.println((new java.text.DecimalFormat("0.000000"))
						.format(Math.sqrt(6.0 * total / count)));
			n = sc.nextInt();
		}
	}
}
