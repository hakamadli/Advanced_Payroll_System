package PayRoll;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JDialog;
import java.io.*;
import java.util.*;
import java.net.*;


public class clsConnection {
		String url = "";
        String username = "";
        String password = "";
	

    public Connection setConnection(Connection conn, String username, String password )
    
    {
    	try
	{
    	
    		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            String path = "jdbc:ucanaccess://C://Users//GTX1070//Desktop//PayRoll.mdb";
            conn = DriverManager.getConnection(path);

            Statement st = conn.createStatement();
            String sql = "Select * from EMPLOYEE";

            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
   

         
    }}catch(SQLException e)
		{
			System.err.println("SQl Exception");
			e.printStackTrace();
			
		}
            catch (Exception e)
            {
                System.out.println("\nAnother Error");
            }
    		return conn;
 
    }
    	
    
    
       
}