package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javaBeen.customer_installment_been;
import Dao.customer_installment_dao;


@WebServlet("/installment")
public class customer_installment_ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	private customer_installment_dao Customer_installment_dao;
    
    public void init() {
    	Customer_installment_dao= new customer_installment_dao();
    }
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 String  card_holder_name = request.getParameter("card_holder_name");
		 String  card_no = request.getParameter("card_no");
		 String  type= request.getParameter("type");
		 String  date= request.getParameter("date");
		 String  security_code= request.getParameter("security_code");
		
	     

	     customer_installment_ customer = new customer_installment_();
	        customer.setCard_holder_name(card_holder_name); 
	        customer.setCard_no(card_no);
	        customer.setType(type);
	        customer.setDate(date);
	        customer.setSecurity_code(security_code);

	        try {
	        	customer_installment_dao.customer_installment_been(Customer);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        response.sendRedirect("payment_2.jsp");
		
		doGet(request, response);
	}


	private void setType(String type) {
		// TODO Auto-generated method stub
		
	}


	private void setSecurity_code(String security_code) {
		// TODO Auto-generated method stub
		
	}


	private void setDate(String date) {
		// TODO Auto-generated method stub
		
	}


	private void setCard_no(String card_no) {
		// TODO Auto-generated method stub
		
	}


	private void setCard_holder_name(String card_holder_name) {
		// TODO Auto-generated method stub
		
	}


}
