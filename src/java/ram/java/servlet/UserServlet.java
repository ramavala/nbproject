/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ram.java.servlet;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ram.java.domain.UserAdd;
import ram.java.repo.UserRepo;

/**
 *
 * @author Admin
 */
@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String name=request.getParameter("name");
        System.out.println("hii"+name);
        int age=Integer.parseInt(request.getParameter("age"));
        
        UserAdd ua=new UserAdd();
        
        ua.setName(name);
        ua.setAge(age);
       String a= new Gson().toJson(ua);
        UserRepo urepo=new UserRepo();
        try {
            urepo.AddingUser(ua);
            response.sendRedirect("UserAdd.jsp");
        } catch (SQLException ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    
}
