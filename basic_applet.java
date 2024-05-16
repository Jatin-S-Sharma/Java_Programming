import java.awt.*;
import javax.swing.*;

public class BasicApplet extends JApplet {
    public void init(){

    }
  
    //redfeine the function using inheritance, 
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Hello, World!", 20, 20);
    }
    
    public static void main(String[] args) {
        JFrame f1 = new JFrame("Basic Applet");
        BasicApplet applet = new BasicApplet();
        applet.init();
        f1.add(applet);
        f1.setSize(200, 200);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
