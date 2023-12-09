package com.jdbc.web.web1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;



import com.jdbc.web.db.DbConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/create-db")
public class CreateDB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * This doGet method load the create-db jsp page.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set content type
		response.setContentType("text/html");
		response.sendRedirect("create-db.jsp");

	}

	/**
	 * This doPost handle form submission.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// set content type
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// collect input parameters
		String dbName = request.getParameter("db_name");
		
		DbConnection db = null;
		
		try {
			// step 1: create connection
			db = new DbConnection();
			db.init();
			
			// step 2: create statement and execute query 
			String query = "CREATE database "+dbName;
			int nfra = db.executeUpdate(query);
			
			request.getRequestDispatcher("index.jsp").include(request, response);
			
			if(nfra>0) {
				out.println("<h2> DB is created sucessfully ! </h2>");
			} else {
				out.println("<h2> DB creation is failed ! </h2>");
			}
			
		} catch (Exception e) {
			// e.printStackTrace();
			out.println("<h2> Exception Occured </h2>");
		} finally {
			out.close();
			db.close();
		}
	}

}
