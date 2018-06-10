import java.util.*;

class Main {

	public static void main(String[] args) {
		String[][] solution = { { "0" }, { "1" }, { "6", "2", "4", "8" }, { "1", "3", "9", "7" }, { "6", "4" }, { "5" },
				{ "6" }, { "1", "7", "9", "3" }, { "6", "8", "4", "2" }, { "1", "9" } };
		String line;

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine() && !(line = sc.nextLine()).equals("0 0")) {

			String[] tokens = line.split(" ");
			int last_digit = Integer.parseInt(tokens[0].substring(tokens[0].length() - 1));
			if (tokens[1].equals("0"))
				System.out.println("1");
			else if (last_digit == 0 || last_digit == 1 || last_digit == 5 || last_digit == 6) {
				System.out.println("" + last_digit);
			} else {
				int divisor = solution[last_digit].length;
				String dividend = tokens[1];
				int remainder = 0;
				for (int i = 0; i <= dividend.length() - 1; i++) {
					remainder = (remainder * 10 + Integer.parseInt(dividend.substring(i, i + 1))) % divisor;
				}
				System.out.println(solution[last_digit][remainder]);

			}
		}
		sc.close();
	}

}
