
package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;

public class AdminSection extends JFrame implements ActionListener
{
    JLabel l1;
    JButton bt1;
    JPanel p1,p2;
    Font f,f1;
    
AdminSection()
{
    super("Admin Page");
        setLocation(0,0);
        setSize(1500,800);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,20);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Library/icon/laptop.png"));
        Image i=img.getImage().getScaledInstance(1500, 800,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        l1=new JLabel(img2);
    
        JMenuBar m1=new JMenuBar();
        JMenu men1=new JMenu("Add Info");
        JMenuItem menu1=new JMenuItem("Add Librarian");
        
        JMenu men2=new JMenu("View Info");
        JMenuItem menu2=new JMenuItem("View Librarian");
        
        JMenu men3=new JMenu("Delete Info");
        JMenuItem menu3=new JMenuItem("Delete Librarian");
        
        JMenu men4=new JMenu("Exit");
        JMenuItem menu4=new JMenuItem("Log Out");
        
        men1.add(menu1);
        men2.add(menu2);
        men3.add(menu3);
        men4.add(menu4);
        
        m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
        
        men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        
        menu1.setFont(f1);
        menu2.setFont(f1);
        menu3.setFont(f1);
        menu4.setFont(f1);
        
        menu1.addActionListener(this);
        menu2.addActionListener(this);
        menu3.addActionListener(this);
        menu4.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
        
}

   public void actionPerformed(ActionEvent e)
 {
         String comd=e.getActionCommand();
            if(comd=="Add Librarian")
            {
            //    System.out.println("add librarian");
            new AddLibrarian().setVisible(true);    
            }
            else if(comd=="View Librarian")
            {
            //    System.out.println("view librarian");
            new ViewLibrarian().setVisible(true);    
            }
            else if(comd=="Delete Librarian")
            {
            //    System.out.println("delete librarian");
            new DeleteLibrarian().setVisible(true);    
            }
            else if(comd=="Log Out")
            {
                
                System.exit(0);
            }
 }
    public static void main(String[] args)
    {
        new AdminSection().setVisible(true);
    }
}
