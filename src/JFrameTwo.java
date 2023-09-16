import javax.swing.*;
import java.awt.*;

public class JFrameTwo {
    private JFrame frame;

    public JFrameTwo() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        this.frame.setTitle("Second screen");
        this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.frame.setSize(500, 400);
        this.frame.setLocationRelativeTo(null);
        this.frame.setResizable(false);
        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));

        Button button1 = new Button("Button 1");
        panel.add(button1);
        Button button2 = new Button("Button 2");
        panel.add(button1);
        Button button3 = new Button("Button 3");
        panel.add(button1);

        this.frame.add(panel, BorderLayout.SOUTH);
        this.frame.setVisible(true);
    }
}
