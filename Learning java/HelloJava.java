
import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello, Java!!!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
