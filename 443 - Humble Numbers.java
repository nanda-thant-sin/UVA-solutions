import java.util.*;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> res = new TreeSet<Integer>();
		PriorityQueue<Integer> toMultipy = new PriorityQueue<Integer>();
		res.add(1);
		toMultipy.add(1);
		while (!toMultipy.isEmpty()) {
			int curr = toMultipy.poll();
			int temp = curr * 2;
			if (curr <= 1000000000) {
				res.add(temp);
				if (!toMultipy.contains(temp))
					toMultipy.add(temp);
			}
			temp = curr * 3;
			if (curr <= 666666666) {
				res.add(temp);
				if (!toMultipy.contains(temp))
					toMultipy.add(temp);
			}
			temp = curr * 5;
			if (curr <= 400000000) {
				res.add(temp);
				if (!toMultipy.contains(temp))
					toMultipy.add(temp);
			}
			temp = curr * 7;
			if (curr <= 285714285) {
				res.add(temp);
				if (!toMultipy.contains(temp))
					toMultipy.add(temp);
			}

		}
		Iterator iterator = res.iterator();
		int[] data = new int[5843];
		int counter = 1;
		while (counter != 5843) {
			data[counter++] = (int) iterator.next();
		}
		StringBuilder sb = new StringBuilder();
		int num = sc.nextInt();
		while (num != 0) {
			if (num % 100 == 11 || num % 100 == 12 || num % 100 == 13)
				sb.append("The " + num + "th humble number is " + data[num] + ".\n");
			else if (num % 10 == 1)
				sb.append("The " + num + "st humble number is " + data[num] + ".\n");
			else if (num % 10 == 2)
				sb.append("The " + num + "nd humble number is " + data[num] + ".\n");
			else if (num % 10 == 3)
				sb.append("The " + num + "rd humble number is " + data[num] + ".\n");
			else
				sb.append("The " + num + "th humble number is " + data[num] + ".\n");
			num = sc.nextInt();
		}
		System.out.print(sb.toString());
		sc.close();
	}

}
