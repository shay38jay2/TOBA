<%-- 
    Document   : footer
    Created on : Apr 15, 2019, 8:34:04 PM
    Author     : Shay
--%>

<%@ page import="java.util.GregorianCalendar, java.util.Calendar"%>
<%
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
    %>
    
    <p>&copy; Copyright <%= currentYear %> Titan Bank Online Banking &amp; </p>
</body>
</html>

    
