package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
 
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class System_mail_for_customer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
    public System_mail_for_customer() {
        super();
        
    }
    
    public static class PlainTextEmailSender {
    	 
        public void sendPlainTextEmail(String host, String port,
                final String userName, final String password, String toAddress,
                String subject, String message) throws AddressException,
                MessagingException {
     
            // sets SMTP server properties
            Properties properties = new Properties();
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", port);
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
     
            // creates a new session with an authenticator
            Authenticator auth = new Authenticator() {
            	
                public PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(userName, password);
                }
            };
     
            Session session = session.getInstance(properties, auth);
     
            // creates a new e-mail message
            Message msg = new MimeMessage(session);
     
            msg.setFrom(new InternetAddress(userName));
            
            InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
            msg.setRecipients(Message.RecipientType.TO, toAddresses);
            
            msg.setSubject(subject);
            msg.setSentDate(new Date());
            // set plain text message
            msg.setText(message);
     
            // sends the e-mail
            Transport.send(msg);
     
        }
     
        /**
         * Test the send e-mail method
         *
         */
        public static void main(String[] args) {
        	
            // SMTP server information
        	
            String host = "Bumble_bee_official.gmail.com";
            String port = "5879";
            String mailFrom = "user_email";
            String password = "email_pass";
     
            // outgoing message information
            
            String mailTo = "jorge74_ferntoOpq@email.com";
            String subject = "Loan_or_about_informations";
            String message = "Hi,MR.Jorje Frenades,this month your insallment setted succesfully,";
     
            PlainTextEmailSender mailer = new PlainTextEmailSender();
     
            try {
                mailer.sendPlainTextEmail(host, port, mailFrom, password, mailTo,
                        subject, message);
                System.out.println("Email sent.");
            } catch (Exception ex) {
                System.out.println("Failed to sent email.");
                ex.printStackTrace();
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
