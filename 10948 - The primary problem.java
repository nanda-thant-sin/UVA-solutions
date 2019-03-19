import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.print.attribute.standard.Sides;

public class Main {
	static LinkedList<Integer> pr;
	static boolean prime[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pr = new LinkedList<Integer>();
		sieveOfEratosthenes(1000000);
		StringBuilder sb = new StringBuilder();
		while (true) {
			int curr = Integer.parseInt(br.readLine());
			if (curr == 0) {
				break;
			}
			sb.append(curr + ":\n");
			if (curr % 2 == 1) {
				if (prime[curr - 2]) {
					sb.append("2+" + (curr - 2));
				} else {
					sb.append("NO WAY!");
				}
				sb.append("\n");
			} else {
				for (int i : pr) {
					if (prime[curr - i]) {
						sb.append(i + "+" + (curr - i) + "\n");
						break;
					}
				}
			}
		}
		System.out.print(sb);
	}

	static void sieveOfEratosthenes(int n) {
		prime = new boolean[n + 1];
		for (int i = 2; i < n; i++)
			prime[i] = true;

		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}
		for (int i = 2; i < n; i++) {
			if (prime[i])
				pr.add(i);
		}
	}

}
