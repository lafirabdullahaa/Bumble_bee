package Servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import Dao.admin_product_crud_dao;
import javaBeen.admin_product_crud_been;



@WebServlet("/")
public class admin_product_crud extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private admin_product_crud_dao Admin_product_crud_dao;

    public void init() {
    	Admin_product_crud_dao = new admin_product_crud_dao();
    }

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		        String action = request.getServletPath();
		        try {
		            switch (action) {
		                case "/new":
		                    showNewForm(request, response);
		                    break;
		                    
		                case "/insert":
		                    insertadmin_product_crud_been(request, response);
		                    break;
		                    
		                case "/delete":
		                    deleteadmin_product_crud_been(request, response);
		                    break;
		                    
		                case "/edit":
		                    showEditForm(request, response);
		                    break;
		                    
		                case "/update":
		                    updateUser(request, response);
		                    break;
		                    
		                default:
		                    listUser(request, response);
		                    break;
		            }
		        } catch (SQLException ex) {
		            throw new ServletException(ex);
		        }
		    }
	

		    private void listUser(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException, ServletException {
		    	
		        List < admin_product_crud_been > listadmin_product_crud_been = admin_product_crud_dao.selectAllProducts();
		        request.setAttribute("listadmin_product_crud_been", listadmin_product_crud_been);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("admin_product_crud.jsp");
		        dispatcher.forward(request, response);
		        
		    }

		    
		    
		    private void showNewForm(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
		    	
		        RequestDispatcher dispatcher = request.getRequestDispatcher("admin_product_crud.jsp");
		        dispatcher.forward(request, response);
		        
		    }
		    
		    

		    private void showEditForm(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, ServletException, IOException {
		    	
		        int id = Integer.parseInt(request.getParameter("no"));
		        admin_product_crud_been existingUser = admin_product_crud_dao.selectadmin_product_crud_been(no);
		        RequestDispatcher dispatcher = request.getRequestDispatcher("admin_product_crud.jsp");
		        request.setAttribute("products", existingUser);
		        dispatcher.forward(request, response);
		        

		    }
		    
		    

		    private void insertadmin_product_crud_been(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		    	
		        String product_id = request.getParameter("product_id");
		        String name = request.getParameter("name");
		        String quality = request.getParameter("quality");
		        String price = request.getParameter("price");
		        admin_product_crud_been newadmin_product_crud_been = new admin_product_crud_been(product_id,name,quality,price);
		        admin_product_crud_dao.insertadmin_product_crud_been(newadmin_product_crud_been);
		        response.sendRedirect("list");
		        
		    }

		    private void updateUser(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		    	
		        int no = Integer.parseInt(request.getParameter("no"));
		        String product_id = request.getParameter("product_id");
		        String name = request.getParameter("name");
		        String quality = request.getParameter("quality");
		        String price = request.getParameter("price");

		        admin_product_crud_been product = new admin_product_crud_been(no,product_id,name,quality,price);
		        admin_product_crud_dao.admin_product_crud_been(product);
		        response.sendRedirect("list");
		        
		    }

		    private void deleteadmin_product_crud_been(HttpServletRequest request, HttpServletResponse response)
		    throws SQLException, IOException {
		    	
		        int no = Integer.parseInt(request.getParameter("no"));
		        admin_product_crud_dao.deleteadmin_product_crud_been(no);
		        response.sendRedirect("list");

		    }

}
