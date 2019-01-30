import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.print("[" + a / b + ";");
			while (true) {
				a %= b;
				if (a == 0) {
					System.out.println("]");
					break;
				}
				if (a == 1) {
					System.out.println(b + "]");
					break;
				}
				int c = a;
				a = b;
				b = c;
				System.out.print(a / b + ",");
			}
		}
		sc.close();
	}
}
