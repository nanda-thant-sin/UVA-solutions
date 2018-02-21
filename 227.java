import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");
		int count = 1;
		while (true) {
			String s = br.readLine();
			if (s.equals("Z"))
				break;
			char[][] data = new char[5][5];
			if (s.length() == 4)
				s += ' ';
			data[0] = s.toCharArray();

			for (int i = 1; i < 5; i++) {
				s = br.readLine();
				if (s.length() == 4)
					s += ' ';
				data[i] = s.toCharArray();
			}
			int x_index = 0, y_index = 0;
			boolean found = false;
			for (int i = 0; i < 5 && !found; i++) {
				for (int j = 0; j < 5 && !found; j++) {
					if (data[i][j] == ' ') {
						x_index = i;
						y_index = j;
						found = true;
					}
				}
			}
			boolean end = false, isWrong = false;
			while (!end) {
				char[] command = br.readLine().toCharArray();
				for (int i = 0; i < command.length; i++) {
					if (command[i] == '0') {
						end = true;
						break;
					} else if (command[i] == 'A' && !isWrong) {
						if (x_index == 0) {
							isWrong = true;
						} else {
							data[x_index][y_index] = data[x_index - 1][y_index];
							data[x_index - 1][y_index] = ' ';
							x_index -= 1;
						}
					} else if (command[i] == 'B' && !isWrong) {
						if (x_index == 4) {
							isWrong = true;
						} else {
							data[x_index][y_index] = data[x_index + 1][y_index];
							data[x_index + 1][y_index] = ' ';
							x_index += 1;
						}
					} else if (command[i] == 'L' && !isWrong) {
						if (y_index == 0) {
							isWrong = true;
						} else {
							data[x_index][y_index] = data[x_index][y_index - 1];
							data[x_index][y_index - 1] = ' ';
							y_index -= 1;
						}
					} else if (command[i] == 'R' && !isWrong) {
						if (y_index == 4) {
							isWrong = true;
						} else {
							data[x_index][y_index] = data[x_index][y_index + 1];
							data[x_index][y_index + 1] = ' ';
							y_index += 1;
						}
					} else {
						isWrong = true;
					}

				}
			}
			if (count > 1)
				sb.append("\n");
			sb.append("Puzzle #" + (count++) + ":\n");
			if (isWrong) {
				sb.append("This puzzle has no final configuration.\n");
			} else {
				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 4; j++) {
						sb.append(data[i][j] + " ");
					}
					sb.append(data[i][4] + "\n");
				}
			}
		}
		System.out.print(sb.toString());
	}
}
