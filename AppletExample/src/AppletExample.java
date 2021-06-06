import java.applet.Applet;
import java.awt.Graphics;

public class AppletExample extends Applet{

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
		
	}

}



//public class AppletExample extends Applet{
//	public void paint(Graphics g) {
//		g.drawString("simple applet",20,20);
//	}
//}


