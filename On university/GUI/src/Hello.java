import javax.swing.*;

public class Hello {
    public static void main(String[] args){
        JFrame frame = new JFrame("First window");
        frame.setSize(400,300);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Hello");
        JButton button = new JButton("Hit me");
        panel.add(label);
        frame.add(panel);
        panel.add(button);
        button.addActionListener(e -> {
            label.setText("You've hit the button");
        });


        frame.setVisible(true);
    }
}
