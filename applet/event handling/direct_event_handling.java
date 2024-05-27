import java.awt.*;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
//event handling
public class bin  {
	public static void main(String [] args){
		JButton j1=new JButton("Button-1");
		JFrame j2= new JFrame("this is title");
		j1.addActionListener(new jatin());
		j2.setSize(600,800);
		j2.add(j1);
		j2.setVisible(true);
	}
	static class jatin implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e){
			System.err.println("button clicked!");
	}
}
}
