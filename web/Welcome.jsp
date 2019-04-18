<%-- 
    Document   : Welcome
    Created on : Apr 16, 2019, 8:29:13 PM
    Author     : Shay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank Home</title>
    </head>
    <body>
        
        
       <nav>
            <a href="index.html">Home</a> &nbsp;
            <a href="Login.html">Sign Up Here</a> &nbsp;
            <a href="New_customer.html">Join Us</a> &nbsp;
            <a href="Success.html">Success</a> &nbsp;
            <a href="Account_activity.html">Account Information</a> &nbsp;
            <a href="Transaction.html">Post Transaction</a>
            
        </nav>
        
        <table align="center" style="border:2px solid #FF0099;">
           <% 
           if(session.getAttribute("userName")!=null && session.getAttribute("userName")!= "")
           {
           String user = session.getAttribute("userName").toString();   
           %>
           {
           else{
                System.out.print("Not Logged In");                
           %>
           }           
           <h1>Welcome Customer to Our Bank</h1>
           <%
           }
           %>
           
       </table>
    
    </body>
</html>
