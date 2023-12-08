package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public Login() {
        // Set up the JFrame
        setTitle("Welcome");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        JLabel usernameLabel = new JLabel("Tài Khoản:");
        JLabel passwordLabel = new JLabel("Mật Khẩu:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        // Set layout manager
        setLayout(new GridLayout(3, 2));

        // Add components to the JFrame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Empty label for spacing
        add(loginButton);

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });
    }

    private void performLogin() {
        // Get the entered username and password
        String enteredUsername = usernameField.getText();
        String enteredPassword = new String(passwordField.getPassword());

        // Replace the following condition with your actual authentication logic
        if ("a".equals(enteredUsername) && "1".equals(enteredPassword)) {
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công. Chào mừng " + enteredUsername + "!");

    		
        } else {
            JOptionPane.showMessageDialog(this, "Đăng nhập thất bại. Vui lòng kiểm tra lại tài khoản và mật khẩu.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                	new Login().setVisible(true);
				} catch (Exception e) {

				}
            }
        });
    }
}
