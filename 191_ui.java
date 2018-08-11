import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.Scanner;

public class Main extends Frame {

	public Main() {
		super("Java AWT Examples");
		prepareGUI();
	}

	public static void main(String[] args) {
		Main awtGraphicsDemo = new Main();
		awtGraphicsDemo.setVisible(true);
	}

	static Scanner sc = new Scanner(System.in);

	private void prepareGUI() {
		setSize(2500, 2500);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
	}

	@Override
	public void paint(Graphics g) {
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int xstart = sc.nextInt(), ystart = sc.nextInt(), xend = sc.nextInt(), yend = sc.nextInt(),
					xleft = sc.nextInt(), ytop = sc.nextInt(), xright = sc.nextInt(), ybottom = sc.nextInt();
			Polygon p = new Polygon();
			Line2D line2d = new Line2D.Double();
			line2d.setLine(xstart * 100, ystart * 100, xend * 100, yend * 100);
			Rectangle2D rectangle2d = new Rectangle();
			rectangle2d.setFrameFromDiagonal(xleft * 100, ytop * 100, xright * 100, ybottom * 100);

			if (rectangle2d.intersectsLine(line2d))

				System.out.println("T");
			else
				System.out.println("F");
			Graphics2D g2 = (Graphics2D) g;
			g2.draw(line2d);
			g2.draw(rectangle2d);
		}
		sc.close();

	}
}
