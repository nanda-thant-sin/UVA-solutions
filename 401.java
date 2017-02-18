import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] data;
		String s;
		boolean mirror, regular;
		while (sc.hasNext()) {
			mirror = regular = true;
			s = sc.next();
			data = s.toCharArray();
			for (int i = 0; i < data.length / 2; i++) {
				if (regular) {
					if (data[i] != data[data.length - i - 1])
						regular = false;
				}
				if (mirror) {
					if (data[i] == 'E')
						data[i] = '3';
					else if (data[i] == 'J')
						data[i] = 'L';
					else if (data[i] == 'S')
						data[i] = '2';
					else if (data[i] == 'Z')
						data[i] = '5';
					else if (data[i] == '3')
						data[i] = 'E';
					else if (data[i] == 'L')
						data[i] = 'J';
					else if (data[i] == '2')
						data[i] = 'S';
					else if (data[i] == '5')
						data[i] = 'Z';
					if (data[i] == 'B' || data[i] == 'C' || data[i] == 'D'
							|| data[i] == 'F' || data[i] == 'G'
							|| data[i] == 'K' || data[i] == 'N'
							|| data[i] == 'P' || data[i] == 'Q'
							|| data[i] == 'R' || data[i] == '4'
							|| data[i] == '6' || data[i] == '7'
							|| data[i] == '9')
						mirror = false;
					else if (data[i] != data[data.length - i - 1])
						mirror = false;
				}
			}
			if (mirror && data.length % 2 == 1) {
				int mid = data.length / 2;
				if (!(data[mid] == 'A' || data[mid] == 'H' || data[mid] == 'I'
						|| data[mid] == 'T' || data[mid] == 'Y'
						|| data[mid] == 'U' || data[mid] == 'O'
						|| data[mid] == 'X' || data[mid] == 'M'
						|| data[mid] == 'V' || data[mid] == '8'
						|| data[mid] == 'W' || data[mid] == '1'))
					mirror = false;
			}
			System.out.print(s + " -- is ");
			if (mirror && regular)
				System.out.println("a mirrored palindrome.");
			else if (mirror)
				System.out.println("a mirrored string.");
			else if (regular)
				System.out.println("a regular palindrome.");
			else
				System.out.println("not a palindrome.");
			System.out.println();

		}
	}
}
