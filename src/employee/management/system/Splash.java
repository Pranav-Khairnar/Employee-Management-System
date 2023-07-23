/*
 * @author P R N V
*/
package employee.management.system;

//import statements 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Splash extends JFrame implements ActionListener {

    public Splash() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(250,30,1200,60);
        heading.setFont(new Font("Serif", Font.ITALIC, 48));
        heading.setForeground(Color.black);
        add(heading);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/splashwallpaper.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50,100,1050,500);
        add(image);
        
        
        JButton start = new JButton("Start the application");
        image.add(start);
        start.setBounds(350,400,300,70);
        start.setBackground(Color.black);
        start.setForeground(Color.white);
        start.addActionListener(this);
        //start.setBorder(null);
        
        
        
        setLocation(200, 50);
        setSize(1170, 650); 
        setVisible(true);
        
   }
   
   @Override
   public void actionPerformed(ActionEvent e){
       setVisible(false);
       new Login();
   }
    
    
    
    public static void main(String[] args) {
        new Splash();
        
    }
}
