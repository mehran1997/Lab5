/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 842458
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();
        
        String user = request.getParameter("username");
        String pass = request.getParameter("password");
        AccountService serviceObject = new AccountService();
        User obj = serviceObject.login(user, pass);
        
        if (obj != null) {
           HttpSession session = request.getSession();
           session.setAttribute("uname", user);
           RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/home.jsp");
           rd.forward(request, response);
        } else {
            
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
            rd.forward(request, response);
            pw.print("Invalid Login");
        }
                    
    }


}
