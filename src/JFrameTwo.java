import javax.swing.*;

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
        this.frame.setVisible(true);
    }
}
