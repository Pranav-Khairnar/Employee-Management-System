/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author P R N V
 */
public class Home extends JFrame implements ActionListener{
    
    JButton addButton, viewButton, updateButton, removeButton;

    public Home() {
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/Home2.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120  , 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1120,630);
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(610,20,420,40);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        heading.setForeground(Color.BLACK);
        image.add(heading);
        
        addButton = new JButton("Add Employee");
        addButton.setBounds(650, 80, 150, 40);
        addButton.addActionListener(this);
        image.add(addButton);
        
        viewButton = new JButton("View Employees");
        viewButton.setBounds(820, 80, 150, 40);
        viewButton.addActionListener(this);
        image.add(viewButton);
        
        removeButton = new JButton("Remove Employee");
        removeButton.setBounds(650, 140, 150, 40);
        removeButton.addActionListener(this);
        image.add(removeButton);
        
        updateButton = new JButton("Update Employee");
        updateButton.setBounds(820, 140, 150, 40);
        updateButton.addActionListener(this);
        image.add(updateButton);
        
        
        setSize(1120,630);
        setLocation(250, 100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        if(ae.getSource() == addButton){
            new AddEmployee();
        } else if (ae.getSource() == removeButton){
            new RemoveEmployee();
        } else {
            new ViewEmployee();
        }
    }
    
    
    public static void main(String[] args) {
        new Home();
    }
}