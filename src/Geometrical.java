import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Geometrical extends Applet implements KeyListener {

	int width;
	int height;
	int iType[][][] = {
			// 0 0 x 0
			// 0 0 x 0
			// 0 0 x 0
			// 0 0 x 0
			{ { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 } },
			// 0 0 0 0
			// 0 0 0 0
			// x x x x
			// 0 0 0 0
			{ { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 1, 1, 1, 1 }, { 0, 0, 0, 0 }, } };
	int posX;
	int posY;

	public void init() {
		height = getSize().height;
		width = getSize().width;
		setBackground(new Color(0, 0, 0));
		posX = 0;
		posY = 0;
		addKeyListener(this);
	}

	public void paint(Graphics g) {
		g.setColor(Color.CYAN);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (iType[1][i][j] == 1) {
					g.fill3DRect(posX + j * 10, posY + i * 10, 10, 10, true);
				}
			}
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		if (arg0.getKeyCode() == KeyEvent.VK_RIGHT) {
			posX += 10;
			repaint();
			arg0.consume();
		} else if (arg0.getKeyCode() == KeyEvent.VK_LEFT) {
			posX -= 10;
			repaint();
			arg0.consume();
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		arg0.consume();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// int i = arg0.getKeyCode();

	}

}
