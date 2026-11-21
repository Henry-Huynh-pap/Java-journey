import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterTeacher extends JFrame {
    JFrame f = new JFrame("The Frame");
    JLabel lbUser = new JLabel("Username");
    JTextField tfUser = new JTextField(10);
    JLabel lbPassword = new JLabel("Password");
    JPasswordField tfPass = new JPasswordField(10);
    JButton btnSignUp = new JButton("Sign Up");

    public RegisterTeacher() {
        f.setLocation(300, 300);
        f.setLayout(new GridLayout(3, 2));
        f.setSize(400, 300);
        Container cont = f.getContentPane();
        cont.add(lbUser);
        cont.add(tfUser);
        cont.add(lbPassword);
        cont.add(tfPass);
        cont.add(btnSignUp);

        btnSignUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sql = "INSERT INTO accounts(username, password) VALUES (?, ?)";
                try {
                    Class.forName("org.postgresql.Driver");
                    try (Connection conn = DriverManager.getConnection(
                            "jdbc:postgresql://localhost:5432/login_db", "henry", "Gaconbienan@4");
                         PreparedStatement ps = conn.prepareStatement(sql)) {
                        ps.setString(1, tfUser.getText().trim());
                        ps.setString(2, new String(tfPass.getPassword()));
                        int record = ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "records=" + record);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Loi: " + ex.getMessage());
                }
            }
        });
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new RegisterTeacher();
    }
}