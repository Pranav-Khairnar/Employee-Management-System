/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author P R N V
 */
public class ViewEmployee extends JFrame implements ActionListener{
    
    JTable table;
    Choice cEmpId;
    JButton search, print, update, back;
    public ViewEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
      
        
        JLabel lblSearch = new JLabel("Search Emp Id");
        lblSearch.setBounds(20,20,150,20);
        add(lblSearch);
        
        cEmpId = new Choice();
        cEmpId.setBounds(180,20,150,20);
        add(cEmpId);
        
        table = new JTable();
        
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            
            while(rs.next()){
                cEmpId.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();;
        }
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from employee");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            e.printStackTrace();;
        }
        
        JScrollPane jsp = new JScrollPane(table);
        jsp.setBounds(0,100,900,600);
        add(jsp);
        
        search = new JButton("Search");
        search.setBounds(20,70,80,20);
        search.addActionListener(this);
        add(search);
        
        print = new JButton("Print");
        print.setBounds(120,70,80,20);
        print.addActionListener(this);
        add(print);
        
        update = new JButton("Update");
        update.setBounds(220,70,80,20);
        update.addActionListener(this);
        add(update);
        
        back = new JButton("Back");
        back.setBounds(320,70,80,20);
        back.addActionListener(this);
        add(back);
        
        
        
        setSize(900,700);
        setLocation(300,100);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == search){
            String query = "select * from employee where empid = '" + cEmpId.getSelectedItem() +"'";
            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rs));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == print){
            try {
                table.print();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(ae.getSource() == update){
            
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    
    public static void main(String[] args) {
       new ViewEmployee();
    }
}
