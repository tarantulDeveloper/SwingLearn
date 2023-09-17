import javax.swing.*;
import java.awt.*;


public class JFrameFlow {
    private JFrame frame;
    private JPanel panel;

    public JFrameFlow() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Flow layout");

        panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.ORANGE);

        for(int i = 1; i <=5; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);

        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
