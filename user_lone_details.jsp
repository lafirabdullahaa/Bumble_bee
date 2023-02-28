<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%

String no = request.getParameter("no");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "bumble_bee";
String userid = "root";
String password = "0opi03q";

try {
	
Class.forName(driver);
} 

catch (ClassNotFoundException e) {
e.printStackTrace();

}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

%>


<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
    <script src="https://kit.fontawesome.com/e8eecd9142.js" crossorigin="anonymous"></script>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
     <link rel="stylesheet" href="css/Admin_style.css">
     <script src="js/Admin_part.js"></script>

    <title>Bumble bee: Buy first and pay later</title>
  </head>
  <body >
   
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>



<!--header section start-->

 <header class="header" >

    <a href="#" class="logo">  <i class="fab fa-pied-piper-hat"></i> -- Loan and Installments </a> 

    <nav class="nevbar">
      <a href="index_2.html">Home</a>
        
        <a href="index.html"> <i class="fas fa-smile"></i> Log-Out</a> 
        
    </nav>

<div id="menu-btn" class="fas fa-bars"> </div>


 </header>
<!--header section end-->



<!--service section starts-->
<section class="services" id="services">

  <h1 class="heading">---- <span>---- ---- ----</span> </h1>
 

  <div class="box-container">
    
  </div>


  

</section>
<!--service section End-->

<table class="table">
  <thead class="table-dark">
    <tr>
      <th scope="col">Customer ID</th>
      <th scope="col">Username</th>
      <th scope="col">Loan amount</th>
      <th scope="col">Installments</th>
      <th scope="col">paid</th>
      <th scope="col">Future Credit</th>
      <th scope="col">Date</th>
      <th scope="col">Time</th>
      <th scope="col">E-Pay</th>
      

    </tr>
  </thead>

  <tbody>
    <tr >
      <th scope="col">B2-x71640129</th>
      <th scope="col"> joshes_alex</th>
      <th scope="col">15000</th>
      <th scope="col">3</th>
      <th scope="col"> 5000</th>
      <th scope="col"> 10000</th>
      <th scope="col"> 02/02/2023</th>
      <th scope="col"> 13:26</th>
      <th scope="col"> Yes</th>
      
    </tr>

 <%
try {
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from customer_loan_details";
resultSet = statement.executeQuery(sql);

while(resultSet.next()){
%>

<tr>
<td><%=resultSet.getString("customer_id") %></td>
<td><%=resultSet.getString("user_name") %></td>
<td><%=resultSet.getString("loan_amount") %></td>
<td><%=resultSet.getString("installment") %></td>
<td><%=resultSet.getString("paid") %></td>
<td><%=resultSet.getString("future_credit") %></td>
<td><%=resultSet.getString("date") %></td>
<td><%=resultSet.getString("time") %></td>
<td><%=resultSet.getString("E_pay") %></td>
</tr>

<%

}
connection.close();
} catch (Exception e)

{
e.printStackTrace();
}

%>


  </tbody>
</table>






  </body>
</html>