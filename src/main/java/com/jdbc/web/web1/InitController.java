package com.jdbc.web.web1;

import java.io.IOException;
import java.io.PrintWriter;

import com.jdbc.web.db.DbConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class InitController
 */
@WebServlet("/init-connection")
public class InitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		DbConnection connection = new DbConnection();
		
		connection.jdbcOperation();
		
		out.print("<h3>Connection Establised.</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
