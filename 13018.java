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
			int end=n+1;
			for (int i = m+1; i <= end; i++) {
				System.out.println(i);
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
