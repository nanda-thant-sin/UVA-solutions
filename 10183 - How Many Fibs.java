import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<BigInteger> ss = new ArrayList<>();
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("2");
		ss.add(a);
		ss.add(b);
		BigInteger c = new BigInteger("3");
		BigInteger d = new BigInteger("10").pow(100);
		while (c.compareTo(d) < 1) {
			ss.add(c);
			a = b;
			b = c;
			c = a.add(b);
		}
		while (true) {
			BigInteger aa = new BigInteger(sc.next());
			BigInteger bb = new BigInteger(sc.next());
			if (aa.toString().equals("0") && bb.toString().equals("0")) {
				break;
			}
			int ans = 0;
			for (int i = 0; i < ss.size(); i++) {
				if (ss.get(i).compareTo(aa) != -1) {
					for (int j = i; j < ss.size(); j++) {
						if (ss.get(j).compareTo(bb) != 1) {
							ans++;
						} else {
							break;
						}
					}
					break;
				}
			}
			System.out.println(ans);
		}

		sc.close();
	}
}
