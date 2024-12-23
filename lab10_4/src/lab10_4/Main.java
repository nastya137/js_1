package lab10_4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.util.Random;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;

//import lab8_4.VerticalLayout;

class VerticalLayout implements LayoutManager
{
    private Dimension size = new Dimension();
    public void addLayoutComponent   (String name, Component comp) {}
    public void removeLayoutComponent(Component comp) {}
    public Dimension minimumLayoutSize(Container c) {
        return calculateBestSize(c);
    }
    public Dimension preferredLayoutSize(Container c) {
        return calculateBestSize(c);
    }
    public void layoutContainer(Container container){
        Component list[] = container.getComponents();
        int currentY = 5;
        for (int i = 0; i < list.length; i++) {
            Dimension pref = list[i].getPreferredSize();
            list[i].setBounds(5, currentY, pref.width, pref.height);
            currentY += 5;
            currentY += pref.height;
        }
    }
    private Dimension calculateBestSize(Container c) {
        return c.getSize();
    }
}

class SolarSystem extends JPanel{
	public Planet sun;
	private Planet mercury;
	private Planet venus;
	private Planet earth;
	private Planet mars;
	private Planet jupiter;
	private Planet saturn;
	private Planet uranus;
	private Planet neptun;
	public SolarSystem() {
	sun = new Planet(0, 50, 251, 255, 68, 0.0);
    mercury = new Planet(75, 8, 110, 87, 64, 0.0722205208);
    venus = new Planet(100, 13, 255, 218, 181, 0.0279625514);
    earth = new Planet(130, 12, 13, 190, 255, 0.0172000693);
    mars = new Planet(160, 11, 246, 128, 37, 0.0091458301);
    jupiter = new Planet(230, 27, 243, 143, 85, 0.001451416);
    saturn = new Planet(280, 20, 236, 217, 139, 0.0005843188);
    uranus = new Planet(320, 17, 89, 236, 187, 0.0002047639);
    neptun = new Planet(360, 16, 28, 188, 255, 0.0001043839);
    Timer timer = new Timer(1, new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	});
    
	timer.start();
	}
	protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	sun.paintComponent(g);
    	mercury.paintComponent(g);
    	venus.paintComponent(g);
    	earth.paintComponent(g);
    	mars.paintComponent(g);
    	jupiter.paintComponent(g);
    	saturn.paintComponent(g);
    	uranus.paintComponent(g);
    	neptun.paintComponent(g);
    }
	public void changeColor(int x, int i) {
		sun.changeColor(x, i);
		mercury.changeColor(x, i);
		venus.changeColor(x, i);
		earth.changeColor(x, i);
		mars.changeColor(x, i);
		jupiter.changeColor(x, i);
		saturn.changeColor(x, i);
		uranus.changeColor(x, i);
		neptun.changeColor(x, i);
	}
}

public class Main {
	static int prevI = 0;
	static int prevC = 0;
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Симуляция солнечной системы");

		JLabel l1 = new JLabel("Цвет");
		JSlider color = new JSlider(-40, 40);
		JPanel clrp = new JPanel();
		clrp.add(l1, BorderLayout.WEST);
		clrp.add(color, BorderLayout.EAST);
		JPanel sliders = new JPanel();
		JLabel l2 = new JLabel("Интенсивность");
		JSlider i = new JSlider(-99, 99);
		JPanel inp = new JPanel();
		inp.add(l2, BorderLayout.WEST);
		inp.add(i, BorderLayout.EAST);
		SolarSystem s = new SolarSystem();
		sliders.add(clrp, BorderLayout.WEST);
		sliders.add(inp, BorderLayout.EAST);
		s.setBackground(new Color(7, 7, 40));
		frame.add(s);
		frame.add(sliders, BorderLayout.PAGE_START);
		frame.setSize(850, 850);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		Timer t= new Timer(5, new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
			    s.changeColor(color.getValue(),i.getValue());
			}});
		
			t.start();
			}
	
}
