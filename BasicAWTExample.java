package MAIN_NOTES;
import java.awt.Frame;
import java.awt.Label;

public class BasicAWTExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        Frame frame = new Frame("Basic AWT Example");

        // Create a label
        Label label = new Label("Hello, AWT!");

        // Add the label to the frame
        frame.add(label);

        // Set the size of the frame
        frame.setSize(200, 100);

        // Make the frame visible
        frame.setVisible(true);
    }
}
