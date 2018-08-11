import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int xstart = sc.nextInt(), ystart = sc.nextInt(), xend = sc.nextInt(), yend = sc.nextInt(),
					xleft = sc.nextInt(), ytop = sc.nextInt(), xright = sc.nextInt(),
					ybottom = sc.nextInt();
			Line2D line2d = new Line2D.Double();
			line2d.setLine(xstart,ystart, xend,yend);
			Rectangle2D rectangle2d = new Rectangle();
			rectangle2d.setFrameFromDiagonal(xleft, ytop, xright, ybottom);
			
			if (rectangle2d.intersectsLine(line2d))

				System.out.println("T");
			else
				System.out.println("F");
		}
		sc.close();
	}
}
