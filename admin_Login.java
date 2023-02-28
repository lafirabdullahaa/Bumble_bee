package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import Dao.admin_Login_dao;
import javaBeen.admin_Login_been;


@WebServlet("/login")
public class admin_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
private admin_Login_dao admin_Login_dao;
	
public void init() {
	setadmin_Login_dao(new admin_Login_dao());
}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm_password = request.getParameter("confirm_password");
        
        admin_Login_been Admin_Login_been = new admin_Login_been();
        
        
        Admin_Login_been.setUsername(username);
        Admin_Login_been.setPassword(password);
        Admin_Login_been.setConfirm_password(confirm_password);
       

        try {
            if (admin_Login_dao.validate(Admin_Login_been)) {
                //HttpSession session = request.getSession();
                
                response.sendRedirect("Admin.jsp");
                
            } else {
                HttpSession session = request.getSession();
                
                response.sendRedirect("index.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
	}

	
	private void setadmin_Login_dao(Dao.admin_Login_dao admin_Login_dao2) {
		// TODO Auto-generated method stub
		
	}


	}

