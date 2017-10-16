import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (m > n) {
				int temp = n;
				n = m;
				m = temp;
			}
			for (int i = 1; i <= (n - m + 1); i++) {
				System.out.println(m + i);
			}
			if(sc.hasNext()){
				System.out.println();
			}
			else{
				break;
			}
		}
		sc.close();
	}
}
