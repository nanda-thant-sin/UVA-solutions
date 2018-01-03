import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.equals("*"))
				break;
			int sum = 0;
			int res = 0;
			for (int i = 1; i < s.length(); i++) {
				char c = s.charAt(i);
				if (c == '/') {
					if (sum == 64)
						res++;
					sum = 0;
				} else if (c == 'W')
					sum += 64;
				else if (c == 'H')
					sum += 32;
				else if (c == 'Q')
					sum += 16;
				else if (c == 'E')
					sum += 8;
				else if (c == 'S')
					sum += 4;
				else if (c == 'T')
					sum += 2;
				else if (c == 'X')
					sum += 1;
			}
			System.out.println(res);
		}
		sc.close();
	}
}
