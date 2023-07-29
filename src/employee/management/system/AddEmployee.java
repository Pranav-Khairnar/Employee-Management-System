/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.management.system;
import com.toedter.calendar.JDateChooser;
import java.awt.*;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author P R N V
 */
public class AddEmployee extends JFrame implements ActionListener{
    
    JButton addButton, backButton;
    JTextField inpName, inpFName, inpSal, inpAddress, inpMail, inpPhone,
               inpAadhar, inpDesignation;
    
    JDateChooser inpDOB;
    JComboBox inpEd;
    JLabel EmpId;
    Random ran = new Random();
    int empId = ran.nextInt(999999);
    

    public AddEmployee() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Employee Details");
        heading.setBounds(320,30,500,50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(50,150,150,30);
        lblName.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblName);
        
         inpName = new JTextField();
        inpName.setBounds(200,150,150,30);
        add(inpName);
        
        
        JLabel lblFName = new JLabel("Father's Name");
        lblFName.setBounds(450,150,150,30);
        lblFName.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblFName);
        
         inpFName = new JTextField();
        inpFName.setBounds(650,150,150,30);
        add(inpFName);
        
        
        JLabel lblDOB = new JLabel("Date of Birth");
        lblDOB.setBounds(50,200,150,30);
        lblDOB.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblDOB);
        
        inpDOB = new JDateChooser();
        inpDOB.setBounds(200, 200,150 , 30);
        add(inpDOB);
        
        
        JLabel lblSal = new JLabel("Salary");
        lblSal.setBounds(450,200,150,30);
        lblSal.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblSal);
        
         inpSal = new JTextField();
        inpSal.setBounds(650,200,150,30);
        add(inpSal);
        
        
        JLabel lblAddress = new JLabel("Address");
        lblAddress.setBounds(50,250,150,30);
        lblAddress.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblAddress);
        
         inpAddress = new JTextField();
        inpAddress.setBounds(200,250,150,30);
        add(inpAddress);
        
        
        JLabel lblPhone = new JLabel("Phone");
        lblPhone.setBounds(450,250,150,30);
        lblPhone.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblPhone);
        
        inpPhone = new JTextField();
        inpPhone.setBounds(650,250,150,30);
        add(inpPhone);
        
        
        JLabel lblMail = new JLabel("Email");
        lblMail.setBounds(50,300,150,30);
        lblMail.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblMail);
        
         inpMail = new JTextField();
        inpMail.setBounds(200,300,150,30);
        add(inpMail);
        
        
        JLabel lblEd = new JLabel("Highest Education");
        lblEd.setBounds(450,300,150,30);
        lblEd.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblEd);
        
        String[] Ed = {"MTech", "BTech", "B.Com", "BBA", "MBA", "BCA", "MCA", "BA", "MA", "BSc", "MSc"};
        inpEd = new JComboBox(Ed);
        inpEd.setBounds(650,300,150,30);
        add(inpEd);
        
        
        JLabel lblDesignation = new JLabel("Designation");
        lblDesignation.setBounds(50,350,150,30);
        lblDesignation.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblDesignation);
        
        inpDesignation = new JTextField();
        inpDesignation.setBounds(200,350,150,30);
        add(inpDesignation);
        
        
        JLabel lblAadhar = new JLabel("Aadhar No");
        lblAadhar.setBounds(450,350,150,30);
        lblAadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblAadhar);
        
        inpAadhar = new JTextField();
        inpAadhar.setBounds(650,350,150,30);
        add(inpAadhar);
        
        
        JLabel lblEmpId = new JLabel("Employee ID");
        lblEmpId.setBounds(50,400,150,30);
        lblEmpId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblEmpId);
        
        EmpId = new JLabel("" + empId);
        EmpId.setBounds(200,400,150,30);
        EmpId.setFont(new Font("serif", Font.PLAIN, 20));
        add(EmpId);
        
        
        addButton = new JButton("Add Details");
        addButton.setBounds(250, 550, 150, 40);
        //addButton.addActionListener(this);
        addButton.setBackground(Color.BLACK);
        addButton.setForeground(Color.WHITE);
        add(addButton);
        addButton.addActionListener(this);
        
        backButton = new JButton("Back");
        backButton.setBounds(450, 550, 150, 40);
        //backButton.addActionListener(this);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.WHITE);
        add(backButton);
        backButton.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        setSize(900,700);
        setLocation(300,50);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == addButton){
            String name = inpName.getText();
            String fName = inpFName.getText();
            String DOB = ((JTextField)inpDOB.getDateEditor().getUiComponent()).getText(); 
            String sal = inpSal.getText();
            String address = inpAddress.getText();
            String phone = inpPhone.getText();
            String mail = inpMail.getText();
            String ed = (String) inpEd.getSelectedItem(); 
            String designation = inpDesignation.getText();
            String aadhar = inpAadhar.getText();
            String EID = EmpId.getText();
            
//            empid varchar(10),
//            name varchar(20),
//            fname varchar(20),
//            dob varchar(30),
//            salary varchar(10),
//            address varchar(100),
//            phone varchar(10),
//            mail varchar(20),
//            education varchar(10),
//            designation varchar(20),
//            aadhar varchar(20)
            try {
                Conn c = new Conn();
                String query = "INSERT INTO employee VALUES('"+EID+"','"+name+"','"+fName+"','"+DOB+"','"+sal+"','"+address+"','"+phone+"','"+mail+"','"+ed+"','"+designation+"','"+aadhar+"');";
                System.out.println(query);
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details Added Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();;
            }
        } else {
            setVisible(false);
            new Home();
        }
    }
    
    public static void main(String[] args) {
        new AddEmployee();
    }
}
