package lab9_4;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.Random;

public class main {
public static void main(String[] args) {
JFrame frame=new JFrame("Отрезок, вращающийся в плоскости экрана");
frame.setPreferredSize( new Dimension(320,320));
final JPanel pan= new JPanel();
Random r=new Random();
Polygon p = new Polygon(new int []{0,0,0},new int[]{0,200,0},2);
frame.add(pan);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();
Timer t= new Timer(200, new ActionListener(){
int i = 0;
@Override
public void actionPerformed(ActionEvent arg0) {
Graphics2D gr=(Graphics2D)pan.getRootPane().getGraphics();
pan.update(gr);
GeneralPath path=new GeneralPath();
path.append(p, true);
gr.translate(150, 150);
AffineTransform tranforms = AffineTransform.getRotateInstance((i++)*0.02, 0, 0);
gr.transform(tranforms);
gr.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
gr.draw(path);
}});
t.start();
}
}

