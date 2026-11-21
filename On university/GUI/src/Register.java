import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.sql.*;

public class Register extends JFrame {

    JLabel lblUser = new JLabel("Login: ");
    JTextField tfUser = new JTextField(10);
    JLabel lblPass = new JLabel("Password: ");
    JPasswordField pfPass = new JPasswordField(10);
    JButton btnRegister = new JButton("Register");
    JButton btnLogin = new JButton("Login");
    JLabel lblMessage = new JLabel("");

    HashMap<String, String> accounts = new HashMap<>();

    public Register() {
        setTitle("Register / Login");
        setLayout(new GridLayout(4, 2));
        add(lblUser);
        add(tfUser);
        add(lblPass);
        add(pfPass);
        add(btnRegister);
        add(btnLogin);
        add(lblMessage);

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = tfUser.getText().trim();
                String pass = new String(pfPass.getPassword());

                if (user.isEmpty() || pass.isEmpty()) {
                    lblMessage.setText("Nhap day du thong tin!");
                    return;
                }

                String sql = "INSERT INTO accounts(username, password) VALUES (?, ?)";
                try (Connection conn = DBConnection.getConnection();
                     PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, user);
                    ps.setString(2, pass);
                    ps.executeUpdate();
                    lblMessage.setText("Dang ky thanh cong!");
                } catch (SQLException ex) {
                    if ("23505".equals(ex.getSQLState())) {
                        lblMessage.setText("Ten dang nhap da ton tai!");
                    } else {
                        lblMessage.setText("Loi CSDL: " + ex.getMessage());
                    }
                }
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = tfUser.getText().trim();
                String pass = new String(pfPass.getPassword());

                String sql = "SELECT 1 FROM accounts WHERE username = ? AND password = ?";
                try (Connection conn = DBConnection.getConnection();
                     PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.setString(1, user);
                    ps.setString(2, pass);
                    try (ResultSet rs = ps.executeQuery()) {
                        if (rs.next()) {
                            lblMessage.setText("Dang nhap thanh cong!");
                        } else {
                            lblMessage.setText("Sai ten hoac mat khau!");
                        }
                    }
                } catch (SQLException ex) {
                    lblMessage.setText("Loi CSDL: " + ex.getMessage());
                }
            }
        });

        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Register();
    }
}