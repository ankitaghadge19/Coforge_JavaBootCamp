<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h2>Error Page</h2>
    <%
        // Using 'exception' to display error information
        if (exception != null) {
            out.println("<p>Error: " + exception.getMessage() + "</p>");
        } else {
            out.println("<p>An unknown error occurred!</p>");
        }
    %>
    <p><a href='form.jsp'>Back to form</a></p>
</body>
</html>
