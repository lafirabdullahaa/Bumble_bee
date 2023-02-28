package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import javaBeen.Customer_Login_been;
import Dao.Customer_Login_dao;



@WebServlet("/login")
public class Customer_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Customer_Login_dao customer_Login_dao;
	
	public void init() {
		setCustomer_Login_dao(new Customer_Login_dao());
    }

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        Customer_Login_been customer_Login_been = new Customer_Login_been();
        
        
        customer_Login_been.setUsername(username);
        customer_Login_been.setPassword(password);
       

        try {
            if (customer_Login_dao.validate(customer_Login_been)) {
                //HttpSession session = request.getSession();
                
                response.sendRedirect("index_2.jsp");
                
            } else {
                HttpSession session = request.getSession();
                
                response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
	}



	public Customer_Login_dao getCustomer_Login_dao() {
		return customer_Login_dao;
	}



	public void setCustomer_Login_dao(Customer_Login_dao customer_Login_dao) {
		this.customer_Login_dao = customer_Login_dao;
	}

}
