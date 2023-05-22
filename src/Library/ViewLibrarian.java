
package Library;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author DILEEP KUMAR
 */
public class ViewLibrarian extends JFrame //implements ActionListener
{
    String x[]={"ID","Name","Password","Email","Contact","Address","City"};
    JButton bt;
    String y[][]=new String[20][7];
    int i=0,j=0;
    JTable t;
    Font f,f1;
    
    ViewLibrarian()
    {
        super("librarian Information");
        setLocation(1,1);
        setSize(1000,400);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,16);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select * from librarian";
            ResultSet rest=obj.smt.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("Lid");
                y[i][j++]=rest.getString("Name");
                y[i][j++]=rest.getString("Password");
                y[i][j++]=rest.getString("Email");
                y[i][j++]=rest.getString("Contact");
                y[i][j++]=rest.getString("Address");
                y[i][j++]=rest.getString("City");
                
                i++; // next row
                j=0; //next row's first column
                
            }
            t=new JTable(y,x);
            t.setFont(f1);
            
            
        }
        catch(Exception ex)
        {
         ex.printStackTrace();
        }
        JScrollPane sp=new JScrollPane(t);
        add(sp);
        
        
    }
    public static void main(String[] args)
    {
        new ViewLibrarian().setVisible(true);
    }
}
