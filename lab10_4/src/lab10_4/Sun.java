package lab10_4;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Sun extends JPanel{
	final int r = 251;
	final int g = 255;
	final int b = 68;
	private int colorR;
	private int colorG;
	private int colorB;
	public Sun(int x, int y, JFrame f) {
		colorR = r;
		colorG = g;
		colorB = b;	
	Timer t= new Timer(50, new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent arg0) {
	    Graphics2D g2d = (Graphics2D) f.getGraphics();
	    g2d.setColor(new Color(colorR, colorG, colorB));
	    g2d.drawOval(x, y, 100, 100);
	    g2d.fillOval(x, y, 100, 100);
	}});
	t.start();
	f.add(this, 0);
	}
	public void changeColor(int x, int i) {
		if (r+2*x<256)
		colorR = r + 2*x;
		else colorR = 255;
		if (g+2*x<256)
		colorG = g + 2*x;
		else colorG = 255;
		if ((b+x)<256)
		colorB = b + x;
		else colorB = 255;
	}
}
