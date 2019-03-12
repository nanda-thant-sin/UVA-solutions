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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] s = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			if (n == 0 && m == 0) {
				break;
			}
			boolean[] isIncluded = new boolean[1000001];
			boolean isConflict = false;
			for (int i = 0; i < n; i++) {
				s = br.readLine().split(" ");
				if (isConflict) {
					continue;
				}
				int st = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				for (int j = st; j < end; j++) {
					if (isIncluded[j]) {
						isConflict = true;
						break;
					} else {
						isIncluded[j] = true;
					}
				}
			}
			for (int i = 0; i < m; i++) {
				s = br.readLine().split(" ");
				if (isConflict) {
					continue;
				}
				int st = Integer.parseInt(s[0]);
				int end = Integer.parseInt(s[1]);
				int rep = Integer.parseInt(s[2]);
				int count = 0;
				while (st + count * rep < 1000001) {
					for (int j = st; j < end; j++) {
						if (j + count * rep > 1000000) {
							break;
						}
						if (isIncluded[j + count * rep]) {
							isConflict = true;
							break;
						} else {
							isIncluded[j + count * rep] = true;
						}
					}
					count++;
				}
			}
			if (isConflict) {
				System.out.println("CONFLICT");
			} else {
				System.out.println("NO CONFLICT");
			}
		}
	}
}
