
package Library;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author DILEEP KUMAR
 */
public class ViewIssueBook extends JFrame
{
    
    String x[]={"BookId","Book No","Book Name","Student Id","Student Name","Student Contact","Date"};
    JButton bt;
    String y[][]=new String[100][7];
    int i=0,j=0;
    JTable t;
    Font f,f1;
    ViewIssueBook()
    {
        super("Issue Book Information");
        setLocation(1,1);
        setSize(1000,400);
        
        f=new Font("Arial",Font.BOLD,25);
        f1=new Font("Arial",Font.BOLD,16);
        
        try
        {
            ConnectionClass obj=new ConnectionClass();
            String q="select * from Issuebook";
            ResultSet rest=obj.smt.executeQuery(q);
            while(rest.next())
            {
                y[i][j++]=rest.getString("BookId");
                y[i][j++]=rest.getString("bookNo");
                y[i][j++]=rest.getString("bookname");
                y[i][j++]=rest.getString("studentId");
                y[i][j++]=rest.getString("studentname");
                y[i][j++]=rest.getString("studentcontact");
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
            new ViewIssueBook().setVisible(true);
        }
}
