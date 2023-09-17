import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyButton {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MyButton() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Button");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(800, 500);

        panel = new JPanel();
        button = createButton();
        panel.add(button);

        frame.add(panel);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false);
        ImageIcon imageIcon = new ImageIcon("/home/bekzhan/IdeaProjects/SwingLearn/src/small.jpg");
        button.setIcon(imageIcon);
        button.setIconTextGap(10);
        button.setMnemonic(KeyEvent.VK_P);
        button.setToolTipText("Just press it!");
        button.setFont(new Font("Arial", Font.PLAIN, 16));
        button.setMargin(new Insets(10,10,10,10));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Press button is clicked!");
            }
        });

        button.doClick();
        button.setEnabled(false);

        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);

        button.setPreferredSize(new Dimension(200, 75));
        return button;
    }

    public void show() {
        frame.setVisible(true);
    }
}

