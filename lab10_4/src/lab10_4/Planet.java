package lab10_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.Arrays;
 
public class Planet extends JPanel{
    private double angle;
    private double delta;
    private int radius;
    private int orb;
    private double x;
    private double y;
    private int red;
    private int green;
    private int blue;
    private int redChanging;
    private int greenChanging;
    private int blueChanging;
    public Planet(int r, int o, int rd, int g, int b, double d){
        angle = 0;
        radius = r;
        orb = o;
        red = rd;
        green = g;
        blue = b;
        redChanging = rd;
        greenChanging = g;
        blueChanging = b;
        delta = d;
        Timer timer = new Timer(1, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                angle += delta;
                }});
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.white);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(1f));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        double phaseX = 0;
        double phaseY = 0;
            phaseX = 0;
            phaseY = phaseY-0.4;
                phaseX = phaseX-0.4;
                x = 380;
                y = 380;
                g2d.draw(circle(x, y, radius));
                g2d.setColor(new Color(redChanging, greenChanging, blueChanging));
                x += radius * Math.cos(angle+phaseY+phaseX);
                y += radius * Math.sin(angle+phaseY+phaseX);
                g2d.fill(circle(x, y, orb));
    }
 
    private Shape circle(double x, double y, double r) {
        return new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
    }
    public void changeColor(int x, int i) {
    	float[] hsv = new float[3];
    	Color.RGBtoHSB(red,green,blue,hsv);
    	hsv[0]=hsv[0]+((float)x/100);
    	hsv[2]=hsv[2]+((float)i/100);
    	
    	if (hsv[0]<0) {
    		hsv[0]=0.0f;
    	}
    	else if (hsv[0]>1) {
    		hsv[0]=1.0f;
    	}
    	
    	if (hsv[2]<0) {
    		hsv[2]=0.0f;
    	}
    	else if (hsv[2]>1) {
    		hsv[2]=1.0f;
    	}
    	int c = Color.HSBtoRGB(hsv[0], hsv[1], hsv[2]);
    	redChanging = (c >> 16) & 0xFF;
    	greenChanging = (c >> 8) & 0xFF;
    	blueChanging = c & 0xFF;
	}
}
