import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();
			if (a == 0)
				break;
			if (a == c && b == d)
				System.out.println(0);
			else if (Math.abs(a - c) == Math.abs(b - d) || a == c || b == d)
				System.out.println(1);
			else
				System.out.println(2);
		}
		sc.close();
	}
}
