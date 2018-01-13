import java.util.*;

class Main {
	static int getCount(char c) {
		if (c == 'J')
			return 1;
		else if (c == 'Q')
			return 2;
		else if (c == 'K')
			return 3;
		else
			return 4;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String s = sc.next();
			if (s.charAt(0) == '#')
				break;
			Stack<Character> p2 = new Stack<Character>();
			Stack<Character> p1 = new Stack<Character>();
			p2.push(s.charAt(1));
			for (int i = 1; i < 52; i++) {
				s = sc.next();
				if (i % 2 == 0)
					p2.push(s.charAt(1));
				else
					p1.push(s.charAt(1));
			}
			boolean two = true;
			Stack<Character> h = new Stack<Character>();
			while (true) {
				if (two) {
					if (!p2.isEmpty())
						h.push(p2.pop());
					else
						break;
				} else {
					if (!p1.isEmpty())
						h.push(p1.pop());
					else
						break;
				}
				two ^= true;
				if (!((h.peek() >= '2' && h.peek() <= '9') || h.peek() == 'T')) {
					char a = h.peek();
					int count = getCount(a);
					boolean done = false;
					while (count > 0) {
						if (two) {
							if (!p2.isEmpty())
								h.push(p2.pop());
							else {
								done = true;
								break;
							}

						} else {
							if (!p1.isEmpty())
								h.push(p1.pop());
							else {
								done = true;
								break;
							}

						}
						count--;
						if (!((h.peek() >= '2' && h.peek() <= '9') || h.peek() == 'T')) {
							two ^= true;
							a = h.peek();
							count = getCount(a);
						}
					}
					if (done)
						break;
					if (two) {
						while (!h.isEmpty())
							p1.add(0, h.remove(0));
					} else {
						while (!h.isEmpty())
							p2.add(0, h.remove(0));
					}
					two ^= true;
				}

			}
			if (p2.size() == 0)
				System.out.format("1%3d\n", p1.size());
			else
				System.out.format("2%3d\n", p2.size());
		}
		sc.close();
	}
}
