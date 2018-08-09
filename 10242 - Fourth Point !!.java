import java.text.DecimalFormat;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		while (sc.hasNext()) {
			double[] x = new double[4];
			double[] y = new double[4];
			for (int i = 0; i < 4; i++) {
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			if (x[0] == x[2] && y[0] == y[2]) {
				double temp = x[0];
				x[0] = x[1];
				x[1] = temp;
				temp = y[0];
				y[0] = y[1];
				y[1] = temp;
			} else if (x[0] == x[3] && y[0] == y[3]) {
				double temp = x[0];
				x[0] = x[1];
				x[1] = temp;
				temp = y[0];
				y[0] = y[1];
				y[1] = temp;
				temp = x[2];
				x[2] = x[3];
				x[3] = temp;
				temp = y[2];
				y[2] = y[3];
				y[3] = temp;
			} else if (x[3] == x[1] && y[3] == y[1]) {
				double temp = x[2];
				x[2] = x[3];
				x[3] = temp;
				temp = y[2];
				y[2] = y[3];
				y[3] = temp;
			}
			double xa = (y[3] - y[0] + (y[3] - y[2]) / (x[3] - x[2]) * x[0] - (y[1] - y[0]) / (x[1] - x[0]) * x[3])
					/ ((y[3] - y[2]) / (x[3] - x[2]) - (y[1] - y[0]) / (x[1] - x[0]));
			if (Double.isNaN(xa))
				xa = x[3];
			double ya = y[3] - (y[1] - y[0]) / (x[1] - x[0]) * (x[3] - xa);
			if (Double.isNaN(ya)) {

				ya = y[3] - (y[1] - y[0]);

			}
			System.out.println(df.format(xa) + " " + df.format(ya));
		}
		sc.close();
	}

}
