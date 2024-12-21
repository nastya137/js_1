package lab8_4;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.*;

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


public class  FrameWithoutMain extends JFrame {
	private JButton btn;
	private JTextField number1;
	private JTextField number2;
	private JTextField numberA;
	private JTextField numberB;
	private JTextField numberC;
	private JTextField newTitle;
	private JRadioButton v1;
	private JRadioButton v2;
	private double n;
	private double r;
	private double a;
	private double b;
	private double c;
	private JPanel p1;
	private JPanel p2;
	private JPanel p3;
	private JPanel p4;
	private JPanel p5;
	private Boolean isVar2;
	private JLabel lx;
	private JLabel ly;
	public FrameWithoutMain () {
		super("Ответ: ");
		setSize(210, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container cont = getContentPane();
		VerticalLayout layout = new VerticalLayout();
		layout.layoutContainer(cont);
		cont.setLayout(layout);
		btn = new JButton("Считать");
		number1 = new JTextField(" ", 15);
		newTitle = new JTextField(" ", 15);
		number2 = new JTextField(" ", 15);
		numberA = new JTextField(" ", 15);
		numberB = new JTextField(" ", 15);
		numberC = new JTextField(" ", 15);
		lx = new JLabel("X ");
		p4 = new JPanel(new BorderLayout());
		p4.add(lx, BorderLayout.WEST);
		p4.add(number1, BorderLayout.EAST);
		ly = new JLabel("Y ");
		p5 = new JPanel(new BorderLayout());
		p5.add(ly, BorderLayout.WEST);
		p5.add(number2, BorderLayout.EAST);
		JLabel la = new JLabel("a ");
		p1 = new JPanel(new BorderLayout());
		p1.add(la, BorderLayout.WEST);
		p1.add(numberA, BorderLayout.EAST);
		JLabel lb = new JLabel("b ");
		p2 = new JPanel(new BorderLayout());
		p2.add(lb, BorderLayout.WEST);
		p2.add(numberB, BorderLayout.EAST);
		JLabel lc = new JLabel("c ");
		p3 = new JPanel(new BorderLayout());
		p3.add(lc, BorderLayout.WEST);
		p3.add(numberC, BorderLayout.EAST);
		v1 = new  JRadioButton("Вариант 1");
		v2 = new  JRadioButton("Вариант 2");
		btn.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
				n=Double.parseDouble(number1.getText());
				r=Double.parseDouble(number2.getText());
				if(isVar2) {
					a=Double.parseDouble(numberA.getText());
					b=Double.parseDouble(numberB.getText());
					c=Double.parseDouble(numberC.getText());
					double sum =0.0;
					for(int i = 1; i<=n; i++) {
						for(int j = 1; j<=r; j++) {
							sum+=(a*i+b*j)/(c*Math.pow(i, j));
						}
					}
					newTitle.setText("Ответ: "+Double.toString(sum));
					New_Name();
				}
				else {
					double x = 1.0;
					double xsum = 0.0;
					double y = 1.0;
					double ysum = 0.0;
					for(int i = 1; i<10; i++) {
						x = Math.pow(x, (2*i)-1);
						y = Math.pow(y, (2*i));
						for(int j = 1; j<=2*i; j++) {
							x = x/j;
							y=y/j;
						}
						y=y/(2*i+1);
						xsum+=x;
						ysum+=y;
					}
					double k = n*xsum-r*ysum;
					newTitle.setText("Ответ: "+Double.toString(k));
					New_Name();
				}
				}
				catch(java.lang.NumberFormatException excp) {
					newTitle.setText("Поля ввода могут содержать только цифры и точку!");
					New_Name();
				}
			}
		});
		v1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				isVar2 = false;
				lx.setText("X ");
				ly.setText("Y ");
				cont.remove(p1);
				cont.remove(p2);
				cont.remove(p3);
				setSize(210, 200);
				refresh();
			}
		});
		v2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				isVar2 = true;
				lx.setText("N ");
				ly.setText("R ");
				
				cont.add(p1, 2);
				cont.add(p2, 3);
				cont.add(p3, 4);
				setSize(210, 250);
				refresh();
			}
		});
		number1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number1.getText();
			}
		});
		number2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				number2.getText();
			}
		});
		cont.add(p4, BorderLayout.CENTER);
		cont.add(p5, BorderLayout.CENTER);
		cont.add(v1 , BorderLayout.CENTER);
		cont.add(v2, BorderLayout.CENTER);
		cont.add(btn, BorderLayout.CENTER);
	}
	private void New_Name()
	{
	    this.setTitle(newTitle.getText());
	}
	private void refresh()
	{
		FrameWithoutMain.this.revalidate();
		FrameWithoutMain.this.repaint();
	}
}
