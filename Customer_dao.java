package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javaBeen.Customer_been;


public class Customer_dao {
	
	
	public int registercustomer(Customer_been customer) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO customer_registration" +
            "  (no,full_name,Date_of_birth,age,city,address,email,phone_number,user_name,password,confirm_password,genter) VALUES " +
            " (?, ?, ?, ?, ?,?,?,?,?,?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/bumble_bee?useSSL=false", "root", "0opi03q");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, customer.getFull_name());
            preparedStatement.setString(3, customer.getDAte_of_birth());
            preparedStatement.setString(4, customer.getAge());
            preparedStatement.setString(5, customer.getCity());
            preparedStatement.setString(6, customer.getAddress());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getPhone_number());
            preparedStatement.setString(9, customer.getUser_name());
            preparedStatement.setString(10,customer.getPassword());
            preparedStatement.setString(11,customer.getConfirm_password());
            preparedStatement.setString(12,customer.getGenter());

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
