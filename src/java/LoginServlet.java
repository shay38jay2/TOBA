/*
 Code the Servlet to retrieve the username and password from the form
we added to login.html. Have the Servlet check that the username is equal
to jsmith@toba.com and the password is equal to "letmein". If the username and 
passwords match, the servlet to forward the request to the account_activity.html.
If it is incorrect, it should forward the request to the login_failure.html page.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

    private Object password;        
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException { 
        try{
        
            //Setup of New Customer          
            NewCustomer cust = new NewCustomer();
            
            //Get User Name and Password from user.
            cust.setUserName(request.getParameter("username"));
            cust.setPassword(request.getParameter("password"));
            
            cust = Transaction.login(cust);
            
            //If customer Login is valid, redirect to Success.html page.
            if(cust.isValid())  
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("custSession", cust);
                response.sendRedirect("Success.html");
                
            } 
            //Else, redirect to Login Failure.
            else
                  response.sendRedirect("Login_failure.html");         
                
                
        }
        
        //If there is a failure, throw an Exception.
        catch(Throwable theException)
        {
            System.out.println(theException);
        }
        
        System.out.println("Please fill out all the form fields");
        
    }
}

    
         
        


            
            
    