<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
   pageEncoding="ISO-8859-1"%> 
<%@taglib uri="WEB-INF/ArithmeticOperationsTagLib.tld" prefix="math" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
   <head> 
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"> 
      <title>Arithmetic Operations</title> 
   </head> 
   <body> 
      <h2>Arithmetic Operations using Custom Tags: </h2> 
      2.7 + 3.1 = 
      <math:add num1="2.7" num2="3.1"/> 
      <br><br> 
      3.8 - 1.6 =  
      <math:sub num1="3.8" num2="1.6"/> 
      <br><br> 
      2.1 * 5.3 =  
      <math:product num1="2.1" num2="5.3"/> 
      <br><br> 
      10.8 / 3 =  
      <math:division num1="10.8" num2="3"/> 
      <br><br> 
   </body> 
</html>