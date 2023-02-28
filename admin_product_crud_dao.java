package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javaBeen.admin_product_crud_been;

public class admin_product_crud_dao {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/bumble_bee?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "0opi03q";

    private static final String INSERT_products_stock_admin_SQL = "INSERT INTO products_stock_admin" + 
    "  (product_id,name,quality,price) VALUES " +
        " (?, ?, ?,?);";

  private static final String SELECT_products_stock_admin_BY_no = "select no,product_id,name,quality,price from products_stock_admin where no =?";
  private static final String SELECT_ALL_products_stock_admin = "select * from products_stock_admin";
  private static final String DELETE_products_stock_admin_SQL = "delete from products_stock_admin where no = ?;";
  private static final String UPDATE_products_stock_admin_SQL = "update products_stock_admin set product_id = ?,name= ?,quality= ?, price =? where no = ?;";

    public admin_product_crud_dao() {}

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }
    

    public void insertUser(admin_product_crud_dao admin_product_crud_dao) throws SQLException {
        System.out.println(INSERT_products_stock_admin_SQL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement
        		(INSERT_products_stock_admin_SQL)) 
        
        {
            preparedStatement.setString(1, Adminproductcruddao.getProduct_id());
            preparedStatement.setString(2, Adminproductcruddao.getname());
            preparedStatement.setString(3, Adminproductcruddao.getquality());
            preparedStatement.setString(4, Adminproductcruddao.getprice());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } 
        
        catch (SQLException e) {
            printSQLException(e);
        }
    }

    
    
    public admin_product_crud_dao selectadmin_product_crud_dao(int no) {
    	
    	admin_product_crud_dao Admin_product_crud_dao = null;
        // Step 1: Establishing a Connection
    	
        try (Connection connection = getConnection();
            // Step 2:Create a statement using connection object
        		
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_products_stock_admin_BY_no);) {
            preparedStatement.setInt(1, no);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
            	String product_id = rs.getString("product_id");
                String name = rs.getString("name");
                String quality = rs.getString("quality");
                String price = rs.getString("price");
                
                Admin_product_crud_dao = new Adminproductcruddao(no, product_id,name, quality, price);
                
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return Admin_product_crud_dao;
    }

    
    
    public List<admin_product_crud_been> selectAlladmin_product_crud_dao() {

        // using try-with-resources to avoid closing resources (boiler plate code)
        List < admin_product_crud_been > admin_product_crud_dao = new ArrayList < > ();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_products_stock_admin);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int no = rs.getInt("no");
                String product_id = rs.getString("product_id");
                String name = rs.getString("name");
                String quality = rs.getString("quality");
                String price = rs.getString("price");
                admin_product_crud_dao.add(new admin_product_crud_been(no, product_id,name, quality, price));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return admin_product_crud_dao;
    }
    
    

    public boolean deleteadmin_product_crud_dao(int no) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_products_stock_admin_SQL);) {
            statement.setInt(1, no);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }
    
    
    

    public boolean updateadmin_product_crud_been(admin_product_crud_been admin_product_crud_been) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_products_stock_admin_SQL);) {
            statement.setString(1, admin_product_crud_been.getProduct_id());
            statement.setString(2, admin_product_crud_been.getName());
            statement.setString(3, admin_product_crud_been.getQuality());
            statement.setString(4, admin_product_crud_been.getPrice());
            statement.setInt(5, admin_product_crud_been.getNo());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
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
    
    

	public static String getSelectUserByNo() {
		return SELECT_products_stock_admin_BY_no;
	}

	public static String getSelectProductsStockAdminByNo() {
		return SELECT_products_stock_admin_BY_no;
	}

	public static String getDeleteProductsStockAdminSql() {
		return DELETE_products_stock_admin_SQL;
	}

	public static String getUpdateProductsStockAdminSql() {
		return UPDATE_products_stock_admin_SQL;
	}

	public static String getInsertProductsStockAdminSql() {
		return INSERT_products_stock_admin_SQL;
	}

	public static String getSelectAllProductsStockAdmin() {
		return SELECT_ALL_products_stock_admin;
	}

	public static void insertadmin_product_crud_been(admin_product_crud_been newadmin_product_crud_been) {
		// TODO Auto-generated method stub
		
	}

	

	public static void admin_product_crud_been(admin_product_crud_been product) {
		// TODO Auto-generated method stub
		
	}



}
