package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class mail_for_customers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public mail_for_customers() {
        super();
        
    }

    @WebServlet("/EmailSendingServlet")
    public class EmailSendingServlet extends HttpServlet {
       
		private static final long serialVersionUID = 1L;
		private String host;
        private String port;
        private String user;
        private String pass;
     
        public void init() {
            // reads SMTP server setting from web.xml file
            ServletContext context = getServletContext();
            host = context.getInitParameter("host");
            port = context.getInitParameter("port");
            user = context.getInitParameter("user");
            pass = context.getInitParameter("pass");
        }
        
        
     
        protected void doPost(HttpServletRequest request,
                HttpServletResponse response) throws ServletException, IOException {
            // reads form fields
            String recipient = request.getParameter("recipient");
            String subject = request.getParameter("subject");
            String content = request.getParameter("content");
     
            String resultMessage = "";
     
            try {
                EmailUtility.sendEmail(host, port, user, pass, recipient, subject,
                        content);
                
                resultMessage = "The e-mail was sent successfully_ your request accepted";
            } 
            
            catch (Exception ex) {
                ex.printStackTrace();
                resultMessage = "There were an error: " + ex.getMessage();
            } 
            
            finally {
                request.setAttribute("Message", resultMessage);
                getServletContext().getRequestDispatcher("/index_2.jsp").forward(
                        request, response);
            }
        }
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
