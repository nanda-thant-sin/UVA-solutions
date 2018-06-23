import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			int b1 = sc.nextInt();
			int b2 = sc.nextInt();
			String num = sc.next();
			long res = 0;
			try {
				res = Long.parseLong(num, b1);
				sb.append(num + " base " + b1 + " = " + Long.toString(res, b2).toUpperCase() + " base " + b2 + "\n");
			} catch (NumberFormatException e) {
				sb.append(num + " is an illegal base " + b1 + " number" + "\n");
			}
		}
		System.out.print(sb.toString());
		sc.close();
	}

}
