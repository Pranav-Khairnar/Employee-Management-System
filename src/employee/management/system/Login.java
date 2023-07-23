/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author P R N V
 */
public class Login extends JFrame{

    Login() {    
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        //UserName
        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBounds(100,50,100,30);
        lblUsername.setForeground(Color.WHITE);
        add(lblUsername);
        
        JTextField inpUsername = new JTextField();
        inpUsername.setBounds(250, 50,100,30);
        add(inpUsername);
        
        
        //Password
        JLabel lblPassword  = new JLabel("Password");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setBounds(100,100,100,30);
        add(lblPassword);
        
        JTextField inpPassword = new JTextField();
        inpPassword.setBounds(250, 100,100,30);
        add(inpPassword);
        
        //Login Button
        JButton login = new JButton("Login");
        ImageIcon loginBg = new ImageIcon(ClassLoader.getSystemResource("images/loginimage.jpg"));
        Image i = loginBg.getImage().getScaledInstance(600, 300, Image.SCALE_DEFAULT);
        ImageIcon addLoginImage = new ImageIcon(i);
        JLabel image = new JLabel(addLoginImage);
        image.setBounds(0,0, 600, 300);
        add(image);
        login.setBounds(250,150,100,30);
        login.setBackground(Color.WHITE);
        login.setForeground(Color.BLACK);
        image.add(login);
        
        
        setSize(600,300);
        setVisible(true);
        setLocation(450,200);
    }
    
    
    
    public static void main(String[] args) {
        new Login();
    }
}
