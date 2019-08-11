package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nucleus.dao.CustomerRDBMSImplService;
import com.nucleus.dao.ICustomerService;
import com.nucleus.entity.Customer;

/**
 * Servlet implementation class CheckerController
 */
@WebServlet("/CheckerController")
public class CheckerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer =response.getWriter();
		String value = request.getParameter("button");
		System.out.println("button:"+value);
		String code=request.getParameter("code");
		System.out.println(code);
		
		ICustomerService customerservice = new CustomerRDBMSImplService();
		HttpSession session = request.getSession();
		if(value.equals("1"))
		{
		try {
			
			ArrayList<Customer> customerlist = customerservice.DisplayNewCustomerDetails();
			session.setAttribute("sn","sn1");
			session.setAttribute("customerlist", customerlist);
			RequestDispatcher dispacher = request.getRequestDispatcher("DisplayNewCustomerDetails.jsp");
			dispacher.forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else if(value.equals("2"))
		{
			try {
				Customer customer = customerservice.GetDataFromTemporaryTable(code);
				customerservice.SaveCustomerDetailsMST(customer);
				customerservice.DeleteCustomerDetails(customer);
				RequestDispatcher dispacher = request.getRequestDispatcher("SuccessInsertCustomerDetails.jsp");
		       	 dispacher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(value.equals("3"))
		{
			try {
				Customer customer = customerservice.GetDataFromTemporaryTable(code);
				customerservice.SaveRejectedCustomerDetails(customer);
				RequestDispatcher dispacher = request.getRequestDispatcher("SuccessUpdateCustomerDetails.jsp");
		       	 dispacher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(value.equals("4"))
		{
		try {
			
			ArrayList<Customer> customerlist = customerservice.DisplayModifiedCustomerDetails();
			session.setAttribute("sn","sn1");
			session.setAttribute("customerlist", customerlist);
			RequestDispatcher dispacher = request.getRequestDispatcher("DisplayModifiedCustomerDetails.jsp");
			dispacher.forward(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		else if(value.equals("5"))
		{
			try {
				Customer customer = customerservice.GetDataFromTemporaryTable(code);
				customerservice.ModifiedRejectedCustomerDetails(customer);
				RequestDispatcher dispacher = request.getRequestDispatcher("SuccessUpdateCustomerDetails.jsp");
		       	 dispacher.forward(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
