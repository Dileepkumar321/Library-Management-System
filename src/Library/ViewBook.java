
package Library;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author DILEEP KUMAR
 */
public class ViewBook extends JFrame
{
    
    String x[]={"ID","BookNo","Bookname","Author","Publisher","Quantity","Issued","Date"};
    JButton bt;
    String y[][]=new String[100][8];
    int i=0,j=0;
    JTable t;
    Font f,f1;
    ViewBook()
    {
        super("Book Information");
        setLocation(1,1);
        setSize(1000,400);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,16);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select * from addbook";
            ResultSet rest=obj.smt.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("id");
                y[i][j++]=rest.getString("BookNo");
                y[i][j++]=rest.getString("author");
                y[i][j++]=rest.getString("bookname");
                y[i][j++]=rest.getString("publisher");
                y[i][j++]=rest.getString("quantity");
                y[i][j++]=rest.getString("issuebook");
                y[i][j++]=rest.getString("date");
                
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
            new ViewBook().setVisible(true);
        }
}
