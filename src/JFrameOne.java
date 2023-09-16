import javax.swing.*;
import java.awt.*;

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
        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(15);
        borderLayout.setVgap(20);
        setLayout(borderLayout);
        add(new Button("West"), BorderLayout.WEST);
        add(new Button("North"), BorderLayout.NORTH);
        add(new Button("South"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("Center"), BorderLayout.CENTER);
        setVisible(true);
    }
}
