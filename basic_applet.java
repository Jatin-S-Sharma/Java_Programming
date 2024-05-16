//-------------------------------------BASIC APPLET PROGRAM-----------------------------
// import java.awt.*;
// import javax.swing.*;

// public class BasicApplet extends JApplet {
//     public void init(){

//     }
  
//     //redfeine the function using inheritance, 
//     public void paint(Graphics g) {
//         super.paint(g);
//         g.drawString("Hello, World!,2,2",2,2);
//     }
    
//     public static void main(String[] args) {
//         JFrame f1 = new JFrame();
//         BasicApplet applet = new BasicApplet();
//         applet.init();
//         f1.add(applet);
//         f1.setSize(200, 200);
//         f1.setVisible(true);
//         f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }
    
// }


//-------------------------------LIFE CYCLE OF APPLET---------------------------------
// import javax.swing.*;
// import java.awt.*;

// public class BasicApplet extends JApplet{
//     public void init(){
//         System.out.println("initialised method called!");
//     }
//     public void start(){
//         System.out.println("start method called!");

//     }
//     public void paint(Graphics g){
//         g.drawString("this is a string", 10, 40);
//     }
//     public void stop(){
//         System.out.println("stop method called!");

//     }
//     public void destroy(){
//         System.out.println("destroy method called!");

//     }
//     public static void main(String [] args){
//         JFrame j1= new JFrame();
//         BasicApplet b1=new BasicApplet();
//         b1.init();
//         b1.start();
//         b1.paint(b1.getGraphics());
//         b1.stop();
//         b1.destroy();
//         j1.add(b1);

        
//     }
// }
