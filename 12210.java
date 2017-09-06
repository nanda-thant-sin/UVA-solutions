import java.util.Scanner;

/**
 * Straightforward
 * 
 * @author Nanda
 *
 */
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int caseNo = 1;
		while (true) {
			int bachelor = sc.nextInt();
			int spinster = sc.nextInt();
			if (bachelor == 0 && spinster == 0) {
				break;
			}
			if (bachelor <= spinster) {
				int total = bachelor + spinster;
				for (int i = 0; i < total; i++) {
					sc.nextInt();
				}
				System.out.println("Case " + (caseNo++) + ": " + 0);
			} else {
				int minAge = sc.nextInt();
				for (int i = 1; i < bachelor; i++) {
					int age = sc.nextInt();
					if (minAge > age) {
						minAge = age;
					}
				}
				for (int i = 0; i < spinster; i++) {
					sc.nextInt();
				}
				System.out.println("Case " + (caseNo++) + ": "
						+ (bachelor - spinster) + " " + minAge);
			}
		}
		sc.close();
	}
}
