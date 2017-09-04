
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rachanagajjar
 */
public class EmpDao 
{
public static Connection getConnection()
{  
        Connection con=null;  
        try
        {  
            Class.forName("org.apche.derby.jdbc.ClientDriver");  
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/sample [app on APP]","app","app");  
        }
        catch(Exception e)
        {
            out.println(e);
        }  
        return con;  
    }  
    public static int Save(emp e){  
       int i = 0;
        
        //boolean s = (i != 0);
        try
        {  
            Connection con=EmpDao.getConnection(); 
            
            PreparedStatement ps=con.prepareStatement("insert into emp(name,password,email,countrt) values (?,?,?,?);");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getPassword());  
            ps.setString(3,e.getEmail());  
            ps.setString(4,e.getCountry());  
              //ps.execute();
        i = ps.executeUpdate();
            //con.close();  
        }
        catch(Exception ex)
        {
            out.println(ex);
        }  
      
            return i; 
        
        
    }  
    /*
        public static List<emp> getAllEmployees()
        {  
        List<emp> list=new ArrayList<>();  
          
        try
        {  
            Connection con=EmpDao.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from emp;");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next())
            {  
                emp e=new emp();  
               
                e.setName(rs.getString(1));  
                e.setPassword(rs.getString(2));  
                e.setEmail(rs.getString(3));  
                e.setCountry(rs.getString(4));  
                list.add(e);  
            }  
            con.close();  
        }
        catch(Exception e)
        {
             out.println(e);
        }  
          
        return list;  
    }  
        */
}
