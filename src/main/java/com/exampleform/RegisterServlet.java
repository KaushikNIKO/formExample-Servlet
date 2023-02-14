package com.exampleform;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        
        String name = req.getParameter("user_name");
        String password = req.getParameter("user_password");
        String email = req.getParameter("user_email");
        String gender = req.getParameter("user_gender");
        String course = req.getParameter("user_course");
        String condition = req.getParameter("condition");
        
        if(condition!=null)
        {
        out.print("<h1>Welcome to Servlet page</h1>");  
        
        out.println("<h3>your Name: "+ name+ "</h3>");
        out.println("<h3>your password: "+password+"</h3>");
        out.println("<h3>your Email: "+email+"</h3>");
        out.println("<h3>your Genger: "+gender+"</h3>");
        out.println("<h3>your Course: "+course+"</h3>");
        
        }else{
            out.println("<h1>You have not accepted the term and condition</h1>");
        }
    }

    
    
}
