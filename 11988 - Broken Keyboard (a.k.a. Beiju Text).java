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
		StringBuilder res = new StringBuilder();
		while (true) {
			String s = br.readLine();
			if (s == null) {
				break;
			}
			LinkedList<Character> temp = new LinkedList<Character>();
			int index = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '[') {
					index = 0;
				} else if (s.charAt(i) == ']') {
					index = temp.size();
				} else {
					temp.add(index++, s.charAt(i));
				}
			}
			for (char c : temp)
				res.append(c);
			res.append("\n");
		}
		System.out.print(res);
	}
}
