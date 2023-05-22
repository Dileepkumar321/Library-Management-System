
package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author DILEEP KUMAR
 */
public class LibrarianSection extends JFrame implements ActionListener
{
     JLabel l1;
    JButton bt1;
    JPanel p1,p2;
    Font f,f1;
    
     LibrarianSection()
    {
        super("Librarian Page");
        setLocation(0,0);
        setSize(1500,800);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,20);
        
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Library/icon/librarian.jpg"));
        Image i=img.getImage().getScaledInstance(1500, 800,Image.SCALE_DEFAULT);
        ImageIcon img2=new ImageIcon(i);
        l1=new JLabel(img2);
        
        JMenuBar m1=new JMenuBar();
        JMenu men1=new JMenu("Add Info");
        JMenuItem menu1=new JMenuItem("Add Book");
        
        JMenu men2=new JMenu("View Info");
        JMenuItem menu21=new JMenuItem("View Book");
        JMenuItem menu22=new JMenuItem("View Issue Book");
        
        JMenu men3=new JMenu("Issue Info");
        JMenuItem menu3=new JMenuItem("Issue Book");
        
        JMenu men4=new JMenu("Return");
        JMenuItem menu4=new JMenuItem("Return Book");
        
        JMenu men5=new JMenu("Exit");
        JMenuItem menu5=new JMenuItem("Log Out");
        
        men1.add(menu1);
        men2.add(menu21);
         men2.add(menu22);
        men3.add(menu3);
        men4.add(menu4);
         men5.add(menu5);
         
         m1.add(men1);
        m1.add(men2);
        m1.add(men3);
        m1.add(men4);
         m1.add(men5);
         
         men1.setFont(f);
        men2.setFont(f);
        men3.setFont(f);
        men4.setFont(f);
        men5.setFont(f);
        
        menu1.setFont(f1);
        menu21.setFont(f1);
        menu22.setFont(f1);
        menu3.setFont(f1);
        menu4.setFont(f1);
        menu5.setFont(f1);
        
        menu1.addActionListener(this);
        menu21.addActionListener(this);
        menu22.addActionListener(this);
        menu3.addActionListener(this);
        menu4.addActionListener(this);
        menu5.addActionListener(this);
        
        setJMenuBar(m1);
        add(l1);
    }
      public void actionPerformed(ActionEvent e)
      {
          String comd=e.getActionCommand();
          if(comd=="Add Book")
            {
             //System.out.println("add book");
            new AddBook().setVisible(true);    
            }
            else if(comd=="View Book")
            {
             //System.out.println("view book");
            new ViewBook().setVisible(true);    
            }
            else if(comd=="View Issue Book")
            {
             System.out.println("View issue book");
           new ViewIssueBook().setVisible(true);    
            }
            else if(comd=="Issue Book")
            {
            // System.out.println("Issue book");
            new IssueBook().setVisible(true);    
            }
            else if(comd=="Return Book")
            {
             //System.out.println("return book");
            new ReturnBook().setVisible(true);    
            }
            else if(comd=="Log Out")
            {
                
                System.exit(0);
            }
 }
    public static void main(String[] args)
    {
        new LibrarianSection().setVisible(true);
    }
          
      
}
