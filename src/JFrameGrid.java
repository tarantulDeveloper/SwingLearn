import javax.swing.*;
import java.awt.*;

public class JFrameGrid {
    private JFrame frame;
    private JPanel panel;

    public JFrameGrid() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("GridLayout");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(0, 5, 10, 10));

        for(int i = 1; i <= 20; i++) {
            JButton button = new JButton("Button " + i);
            panel.add(button);
        }

        frame.add(panel);
        frame.pack();

        frame.setVisible(true);
    }
}
