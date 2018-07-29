import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num;
		StringBuilder sb = new StringBuilder();
		int isprime[] = new int[1000001];
		isprime[0] = isprime[1] = 1;
		for (int i = 2; i < 1000; i++) {
			if (isprime[i] == 0) {
				int mul = 2;
				while (mul * i < 1000001)
					isprime[mul++ * i] = 1;
			}
		}
		while (true) {
			num = Integer.parseInt(br.readLine());
			if (num == 0)
				break;
			for (int i = 3; i <= num / 2; i++) {
				if (isprime[i] == 0 && isprime[num - i] == 0) {
					sb.append(num + " = " + i + " + " + (num - i) + "\n");
					break;
				}
			}
		}
		System.out.print(sb.toString());
	}
}
