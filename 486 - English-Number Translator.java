import java.util.*;

class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("one", 1);
		h.put("two", 2);
		h.put("three", 3);
		h.put("four", 4);
		h.put("five", 5);
		h.put("six", 6);
		h.put("seven", 7);
		h.put("eight", 8);
		h.put("nine", 9);
		h.put("ten", 10);
		h.put("eleven", 11);
		h.put("twelve", 12);
		h.put("thirteen", 13);
		h.put("fourteen", 14);
		h.put("fifteen", 15);
		h.put("sixteen", 16);
		h.put("seventeen", 17);
		h.put("eighteen", 18);
		h.put("nineteen", 19);
		h.put("twenty", 20);
		h.put("thirty", 30);
		h.put("forty", 40);
		h.put("fifty", 50);
		h.put("sixty", 60);
		h.put("seventy", 70);
		h.put("eighty", 80);
		h.put("ninety", 90);
		while (sc.hasNextLine()) {
			String[] s = sc.nextLine().split(" ");
			int[] res = new int[9];
			int index = 8;
			boolean isNegative = false;
			for (int i = s.length - 1; i >= 0; i--) {
				String curr = s[i];
				if (curr.equals("thousand")) {
					index = 5;
				} else if (curr.equals("million")) {
					index = 2;
				} else if (curr.equals("hundred")) {
					index -= 2;
				} else {
					if (curr.equals("negative")) {
						isNegative = true;
					} else if (curr.equals("zero")) {
						res[index] = 0;
					} else {
						int num = h.get(s[i]);
						int temp_index = index;
						while (num > 0) {
							int temp = num % 10;
							num = num / 10;
							res[temp_index--] += temp;
						}
					}
				}
			}
			int ans = 0;
			for (int i = 0; i <= 8; i++) {
				ans = ans * 10 + res[i];
			}
			if (isNegative)
				ans *= -1;
			System.out.println(ans);
		}
		sc.close();
	}
}
