package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import javaBeen.Customer_been;
import Dao.Customer_dao;



@WebServlet("/register")
public class Customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Customer_dao Customer_dao;
       
    public void init() {
    	Customer_dao= new Customer_dao();
    }
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String  full_name = request.getParameter("full_name");
		 String  date_of_birth = request.getParameter("date_of_birth");
		 String  age= request.getParameter("age");
		 String  city= request.getParameter("city");
		 String  address= request.getParameter("address");
		 String  email= request.getParameter("email");
	     String  phone_number= request.getParameter("phone_number");
	     String  user_name= request.getParameter("user_name");
	     String  password= request.getParameter("password");
	     String  confirm_password= request.getParameter("confirm_password");
	     String  genter= request.getParameter("genter");
	     

	        Customer customer = new Customer();
	        customer.setFull_name(full_name); 
	        customer.setDAte_of_birth(date_of_birth);
	        customer.setAge(age);
	        customer.setCity(city);
	        customer.setAddress(address);
	        customer.setEmail(email);
	        customer.setPhone_number(phone_number);
	        customer.setUser_name(user_name);
	        customer.setPassword(password);
	        customer.setConfirm_password(confirm_password);
	        customer.setGenter(genter);

	        try {
	        	Customer_dao.registercustomer(Customer);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("index_2.jsp");
		
		doGet(request, response);
	}


	private void setAge(String age) {
		// TODO Auto-generated method stub
		
	}


	private void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}


	private void setGenter(String genter) {
		// TODO Auto-generated method stub
		
	}


	private void setConfirm_password(String confirm_password) {
		// TODO Auto-generated method stub
		
	}


	private void setPassword(String password) {
		// TODO Auto-generated method stub
		
	}


	private void setUser_name(String user_name) {
		// TODO Auto-generated method stub
		
	}


	private void setPhone_number(String phone_number) {
		// TODO Auto-generated method stub
		
	}


	private void setEmail(String email) {
		// TODO Auto-generated method stub
		
	}


	private void setCity(String city) {
		// TODO Auto-generated method stub
		
	}


	private void setDAte_of_birth(String date_of_birth) {
		// TODO Auto-generated method stub
		
	}


	private void setFull_name(String full_name) {
		// TODO Auto-generated method stub
		
	}

}
