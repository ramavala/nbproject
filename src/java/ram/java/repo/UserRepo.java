/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ram.java.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ram.java.db.DbConnection;
import ram.java.domain.UserAdd;

/**
 *
 * @author Admin
 */
public class UserRepo 
{
    Connection con;
    PreparedStatement ps;
    
    public void AddingUser(UserAdd ua) throws SQLException
    {
        
         String a=ua.getName();
         System.out.println("aaaa"+a);
         DbConnection db=new DbConnection();
         con=db.getConnection();
         String sql="insert into useradd(Name,Age) values(?,?)";
         ps=con.prepareStatement(sql);
         ps.setString(1, ua.getName());
         ps.setInt(2, ua.getAge());
         ps.executeUpdate();
         
         
        
    }
    
}
