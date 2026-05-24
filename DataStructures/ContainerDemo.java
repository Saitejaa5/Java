import javax.swing.*;
import java.awt.*;

public class ContainerDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Container Example");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        panel.add(new JLabel("Name:"));
        panel.add(new JTextField(10));
        panel.add(new JButton("Submit"));

        frame.add(panel);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // JDialog example
        JDialog dialog = new JDialog(frame, "Message", true);
        dialog.setSize(200, 100);
        dialog.add(new JLabel("This is a dialog"));
        dialog.setVisible(true);
    }
}