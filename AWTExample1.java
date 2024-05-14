package MAIN_NOTES;

import java.awt.*;    
  
public class AWTExample1 extends Frame {    
  
   AWTExample1() {  
  
      Button b = new Button("AWT");  
      TextArea d = new TextArea("This is string");  
  
      b.setBounds(30,100,80,30);  
      add(b);  
      setSize(300,300);  
      setTitle("Hello AWT");   
      setLayout(null);  
      setVisible(true); 
      d.setBounds(30,100,80,30);  
      add(d);  
      setSize(300,300);  
      setTitle("Hello AWT");   
      setLayout(null);  
      setVisible(true); 
      
   
}    
  
public static void main(String args[]) {   
  
AWTExample1 f = new AWTExample1();    
  
}  
  
}    