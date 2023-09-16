import javax.swing.*;

public class MainWindow {
    private final JFrame window;
    public MainWindow() {
        window = new JFrame();
        window.setTitle("Hello World!");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 600);
        window.setLocationRelativeTo(null);


    }

    public void show() {
        window.setVisible(true);
    }
}
