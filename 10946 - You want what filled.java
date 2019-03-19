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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Stream;

import javax.print.attribute.standard.Sides;

public class Main {
	static char[][] data;
	static List<hole> res;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int count = 1;
		StringBuilder sb = new StringBuilder();
		while (true) {
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			if (x == 0) {
				break;
			}
			data = new char[x][y];
			for (int i = 0; i < x; i++) {
				data[i] = br.readLine().toCharArray();
			}
			res = new ArrayList<hole>();
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					if (data[i][j] != '.') {
						char alpha = data[i][j];
						int size = search(i, j, data[i][j]);
						res.add(new hole(size, alpha));
					}
				}
			}
			Collections.sort(res, Comparator.comparing(hole::getSize).reversed().thenComparing(hole::getAlpha));
			sb.append("Problem " + (count++) + ":\n");
			for (hole curr : res) {
				sb.append(curr.getAlpha() + " " + curr.getSize() + "\n");
			}
			s = br.readLine().split(" ");
		}
		System.out.print(sb);
	}

	static int search(int x, int y, char alpha) {
		int res = 1;
		data[x][y] = '.';
		if (x + 1 < data.length && data[x + 1][y] == alpha) {
			res += search(x + 1, y, alpha);
		}
		if (x != 0 && data[x - 1][y] == alpha) {
			res += search(x - 1, y, alpha);
		}
		if (y + 1 < data[0].length && data[x][y + 1] == alpha) {
			res += search(x, y + 1, alpha);
		}
		if (y != 0 && data[x][y - 1] == alpha) {
			res += search(x, y - 1, alpha);
		}
		return res;

	}
}

class hole {
	private int size;
	private char alpha;

	public hole(int size, char alpha) {
		super();
		this.size = size;
		this.alpha = alpha;
	}

	public int getSize() {
		return size;
	}

	public char getAlpha() {
		return alpha;
	}
}
