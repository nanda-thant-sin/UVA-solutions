import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			long n = sc.nextLong();
			if (n == 0)
				break;
			if (n % 9 == 0) {
				System.out.println((n + n / 9 - 1) + " " + (n + n / 9));
			} else {
				System.out.println(n + n / 9);
			}
		}
	}
}
