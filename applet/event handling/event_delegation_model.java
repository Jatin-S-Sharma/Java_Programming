import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventDelegationExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Delegation Example");
        JPanel panel = new JPanel();
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == button1) {
                    System.out.println("Button 1 clicked");
                } else if (e.getSource() == button2) {
                    System.out.println("Button 2 clicked");
                }
            }
        };

        button1.addActionListener(listener);
        button2.addActionListener(listener);

        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
