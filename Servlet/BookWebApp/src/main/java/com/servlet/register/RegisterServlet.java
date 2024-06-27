package com.servlet.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final String INSERT_QUERY  = "INSERT INTO BookData(ID ,BookTitle, BookAuthor, BookPrice, BookQuantity) VALUES(?,?,?,?,?)";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//get print writer
		PrintWriter pw =res.getWriter();
	
		//set content type
		res.setContentType("text/html");
		
		//Get the values of book info
		String bookId = req.getParameter("bookId");
		String bookTitle = req.getParameter("bookTitle");
		String bookAuthor = req.getParameter("bookAuthor");
		float bookPrice = Float.parseFloat(req.getParameter("bookPrice"));
		String bookQuantity = req.getParameter("bookQuantity");
		
		//load JDBC Drier
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Generate the connection
		try (Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ankita","root","1234");
				PreparedStatement ps=con.prepareStatement(INSERT_QUERY);){
			ps.setString(1, bookId);
			ps.setString(2, bookTitle);
			ps.setString(3, bookAuthor);
			ps.setFloat(4, bookPrice);
			ps.setString(5, bookQuantity);
			
			//execute a query
			int count = ps.executeUpdate();
			if(count==1) {
				pw.println("<h2>Record is registered successfully!</h2>");
			}else {
				pw.println("<h2>Record is not registered successfully!</h2>");
			}
			
		}catch (SQLException e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			pw.println(e.getMessage());
			e.printStackTrace();
		}
		
		pw.println("<a href='home.html'>Home</a>");
		pw.println("<br>");
		pw.println("<a href='bookList'>Book List</a>");
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}
