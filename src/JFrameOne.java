import javax.swing.*;

public class JFrameOne extends JFrame {
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("First screen");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
