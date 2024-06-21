<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h2>Welcome!</h2>
    <%
        // Using 'request' to get parameters
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Validate input
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            throw new Exception("Email or Password cannot be empty");
        }

        // Using 'session' to store user data
        session.setAttribute("userEmail", email);
        session.setAttribute("userPassword", password);
        
        // Using 'application' to get context init parameter
        String appName = application.getInitParameter("login");
        
        // Using 'config' to get servlet configuration
        String servletName = config.getServletName();
        
        // Using 'pageContext' to set an attribute
        pageContext.setAttribute("currentDate", new Date(), PageContext.PAGE_SCOPE);
        
        // Using 'out' to write to the response
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("<p>Application Name: " + appName + "</p>");
        out.println("<p>Servlet Name: " + servletName + "</p>");
        out.println("<p>Current Date: " + pageContext.getAttribute("currentDate") + "</p>");
        out.println("<p><a href='login.jsp'>Back to Login</a></p>");
    %>
</body>
</html>
