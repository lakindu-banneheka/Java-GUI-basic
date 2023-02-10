import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    int count = 0;
    private JFrame frame;
    private JPanel panel;
    private JLabel lable;
    private JLabel button;

    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        lable = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(lable);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("First GUI");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        lable.setText("Number of clicks: " + count);
    }
}