import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.nextLine();
			if (s.equals("#"))
				break;
			HashMap<String, Integer> a = new HashMap<String, Integer>();
			ArrayList<String[]> ss = new ArrayList<String[]>();
			while (true) {
				String[] d = s.split(",");
				ss.add(d);
				for (int i = 0; i < 5; i++) {
					if (a.containsKey(d[i])) {
						a.put(d[i], a.get(d[i]) + 1);
					} else
						a.put(d[i], 1);
				}
				s = sc.nextLine();
				if (s.charAt(0) == 'e')
					break;
			}
			int count = 0;
			int index = 0;
			for (int i = 0; i < ss.size(); i++) {
				String[] q = ss.get(i);
				int temp = 0;
				for (int j = 0; j < 5; j++) {
					temp += a.get(q[j]);
				}
				if (temp > count) {
					index = i + 1;
					count = temp;
				}
			}
			System.out.println(index);
		}
		sc.close();
	}
}
