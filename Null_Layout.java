import javax.swing.*;
// import javax.swing.JFrame;

public class M {
    public static void main(String[] args) {
        JFrame f1 = new JFrame("NullLayoutExample");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // f1.setSize(1800,1000);

        JButton b1 = new JButton("Button-1");
        JButton b2 = new JButton("Button-2");
        JButton b3 = new JButton("Button-3");
        JButton b4 = new JButton("Button-4");
        JButton b5 = new JButton("Button-5");

        // Add buttons to the frame
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.add(b5);

        // Set layout to null for absolute positioning
        f1.setLayout(null);

        // Set positions and sizes of buttons
        b1.setBounds(120, 50, 100, 30);
        b2.setBounds(320, 50, 100, 30);
        b3.setBounds(520, 50, 100, 30);
        b4.setBounds(120, 250, 100, 30);
        b5.setBounds(320, 250, 100, 30);

        // Set frame size and visibility
        f1.setSize(1600, 1200);
        // f1.setLayout(null);
        f1.setVisible(true);
    }
}
