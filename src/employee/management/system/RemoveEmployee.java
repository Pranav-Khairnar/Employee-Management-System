
package employee.management.system;

/**
 *
 * @author P R N V
 */
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class RemoveEmployee  extends JFrame implements ActionListener{
    
    Choice cEmpId;
    JButton delete, back;
    public RemoveEmployee(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel labelEmpId = new JLabel("Employee Id");
        labelEmpId.setBounds(50,50,100,30);
        add(labelEmpId);
        
        
        cEmpId = new Choice();
        cEmpId.setBounds(200,50,150,30);
        add(cEmpId);
        
        try {
            Conn c = new Conn();
            String query = "select * from employee";
                       
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                cEmpId.add(rs.getString("empid"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50,100,100,30);
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200,100,100,30);
        add(lblname);
        
        
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(50,150,100,30);
        add(labelphone);
        
        JLabel lblphone = new JLabel();
        lblphone.setBounds(200,150,100,30);
        add(lblphone);
        
        
        
        JLabel labelmail = new JLabel("Email");
        labelmail.setBounds(50,200,100,30);
        add(labelmail);
        
        JLabel lblmail = new JLabel();
        lblmail.setBounds(200,200,100,30);
        add(lblmail);
        
        
        
        try {
            Conn c = new Conn();
            String query = "select * from employee where empid = '"+cEmpId.getSelectedItem()+"'";
                       
            ResultSet rs = c.s.executeQuery(query);
            
            while(rs.next()){
                lblname.setText(rs.getString("name"));
                lblmail.setText(rs.getString("mail"));
                lblphone.setText(rs.getString("phone"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        cEmpId.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent ie){
                    try {
                        Conn c = new Conn();
                        String query = "select * from employee where empid = '"+cEmpId.getSelectedItem()+"'";

                        ResultSet rs = c.s.executeQuery(query);

                        while(rs.next()){
                            lblname.setText(rs.getString("name"));
                            lblmail.setText(rs.getString("mail"));
                            lblphone.setText(rs.getString("phone"));
                        }
                    } catch (Exception e) {
                      e.printStackTrace();
                    }
                
            }
            
        });
        
        
        delete = new JButton("Delete");
        delete.setBounds(80,300,100,30);
        delete.setBackground(Color.black);
        delete.setForeground(Color.white);
        delete.addActionListener(this);
        add(delete);
        
        back = new JButton("Back");
        back.setBounds(220,300,100,30);
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1000,400);
        setLocation(300,150);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == delete){
            try {
                Conn c = new Conn();
                String query = "delete from employee where empid = '" + cEmpId.getSelectedItem()+"'";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
                setVisible(false);
                new Home(); 
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    
    public static void main(String[] args) {
        new RemoveEmployee();
    }
    
}
