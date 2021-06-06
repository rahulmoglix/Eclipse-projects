import java.applet.Applet;
import java.awt.Graphics;

public class AppletExample2 extends Applet{
	
	int height,width;
	
	public void init() {
		System.out.println("Init is called");
		height=getSize().height;
		width=getSize().width;
		setName("Myapplet");
	}
	
	public void start() {
		System.out.println("Start is called");
	}
	public void stop() {
		System.out.println("Stop is called");
	}
	
	public void distroy() {
		System.out.println("Distroy is called");
	}
	
	public void paint(Graphics g) {
		System.out.println("paint is called");
		g.drawRect(50, 80, 200, 100);
//		g.draw3DRect(20, 30, 200, 100, true);
		g.drawLine(60, 150, 200, 120);
		g.drawOval(50, 80, 200, 120);
	}
}
