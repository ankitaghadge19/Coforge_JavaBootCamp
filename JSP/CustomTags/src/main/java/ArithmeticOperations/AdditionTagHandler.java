package ArithmeticOperations;

import java.io.IOException; 
import jakarta.servlet.jsp.JspException; 
import jakarta.servlet.jsp.JspWriter; 
import jakarta.servlet.jsp.tagext.SimpleTagSupport; 

public class AdditionTagHandler extends SimpleTagSupport { 
    
    double num1; 
    double num2; 
      
    public double getNum1() { 
        return num1; 
    } 
  
    public void setNum1(double num1) { 
        this.num1 = num1; 
    } 
  
    public double getNum2() { 
        return num2; 
    } 
  
    public void setNum2(double num2) { 
        this.num2 = num2; 
    } 
  
    public void doTag() throws JspException,IOException 
    { 
        JspWriter out = getJspContext().getOut(); 
        double sum = num1 + num2; 
        out.println(String.format("%.2f", sum)); 
    } 
} 
