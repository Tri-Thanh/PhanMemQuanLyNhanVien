package phanmemquanlynhanvien.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.*;
import phanmemquanlynhanvien.classes.KetNoiDatabase;

public class LoginFrame extends JFrame implements ActionListener, KeyListener {

    private JLabel userNameLabel, passwordLabel;
    private JTextField userNameTextField, passwordTextField;
    private JButton loginButton;
    private ImageIcon i1, i3;
    private Image i2;
    private JLabel imageLabel;

    public LoginFrame() {

        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);

        userNameLabel = new JLabel("User Name");
        userNameLabel.setBounds(40, 50, 100, 40);
        this.add(userNameLabel);

        userNameTextField = new JTextField();
        userNameTextField.setBounds(150, 50, 150, 40);
        this.add(userNameTextField);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(40, 110, 100, 40);
        this.add(passwordLabel);

        passwordTextField = new JTextField();
        passwordTextField.setBounds(150, 110, 150, 40);
        this.add(passwordTextField);

        loginButton = new JButton("LOGIN");
        loginButton.setBounds(150, 170, 150, 40);
        loginButton.setBackground(Color.cyan);
        loginButton.setForeground(Color.BLACK);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        this.add(loginButton);

        i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/userIcon.png"));
        i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        i3 = new ImageIcon(i2);

        imageLabel = new JLabel(i3);
        imageLabel.setBounds(350, 20, 200, 200);
        this.add(imageLabel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 300);
        this.setLocation(450, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String userName = userNameTextField.getText();
            String passWord = passwordTextField.getText();

            KetNoiDatabase dB = new KetNoiDatabase();

            String query = "SELECT * FROM login " + 
                       "WHERE username = '" + userName + "' " + 
                       "and password = '" + passWord + "'"; 

            ResultSet rs = dB.statement.executeQuery(query);

            if (rs.next()) {
                setVisible(false);
            } else {
                JOptionPane.showMessageDialog(
                        null, 
                        "Invalid username or password");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
       ; 
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_ENTER){
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
         
        
        
    }
}
