/*
 *To Add new Session scope and bind the customer object to the success
* page and display all the attributes along with new username and password.
 */

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Shay
 */
public class UserLog extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public void doPost(HttpServletRequest req, HttpServletResponse res, String username, String IdUsed)
            throws ServletException, IOException{
        res.setContentType("text/html");        
        
        System.out.println("You have Connected with Success");
        
        Connection con = null;
        
        String url = "https://github.com/shay38jay2/TOBA.git";      
        String drive = "Document.NetBeansProjects.TOBA";
        String userName = "";
        String password = "";
        String key_Incorrect ="";
        
        Statement message_States =null;
        ResultSet the_Outcome =null;
        
        HttpSession sess = req.getSession(true);
        try{
            Class.forName(drive).newInstance();
            con=DriverManager.getConnection(url + password + userName);
            if(req.getParameter("username")!=null &&
                    req.getParameter("username")!=""&& req.getParameter("password")!=null &&
                    req.getParameter("password")!="")
            {
                username=req.getParameter("username").toString();
                IdUsed = req.getParameter("password").toString();
                key_Incorrect ="select * from activated where username="+username+""
                        + "and password="+IdUsed+"";
                
                System.out.println(key_Incorrect);
                
                message_States = con.createStatement();
                the_Outcome = message_States.executeQuery(key_Incorrect);
                int counter_Is = 0;
                while(the_Outcome.next()){
                    sess.setAttribute("username",the_Outcome.getString(2));
                    counter_Is++;
                }
                
                if(counter_Is > 0){
                    res.sendRedirect("NewCustomer.java");
                }            
                else{
                    res.sendRedirect("Login.html");
                }
            }
        
            else{
                res.sendRedirect("Login.html");
            }
            
            System.out.println("You should be Connected. Thank you.");
            
            con.close();
            
            System.out.println("You are now Disconnected. Thank you.");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
                        
                     
            
                        
      