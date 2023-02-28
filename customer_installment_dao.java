package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javaBeen.customer_installment_been;

public class customer_installment_dao {
	
	public int installemntcustomer(customer_installment_been customer_installment_dao) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customer_installment_details" +
            "  (no,card_hallder_name,card_no,cradit_or_debit,date,security_code) VALUES " +
            " (?, ?, ?, ?, ?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/bumble_bee?useSSL=false", "root", "0opi03q");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, customer_installment_dao.getCard_holder_name());
            preparedStatement.setString(3, customer_installment_dao.getCard_no());
            preparedStatement.setString(4, customer_installment_dao.getType());
            preparedStatement.setString(5, customer_installment_dao.getDate());
            preparedStatement.setString(6, customer_installment_dao.getSecurity_code());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process  exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
	

}
