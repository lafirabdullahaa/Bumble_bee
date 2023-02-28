
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

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="https://kit.fontawesome.com/766d21d255.js" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bumble bee: Buy first and pay later</title>

    <link rel="stylesheet" href="css/card.css">
</head>
<body>

    <div class="container">
    
    <form method="POST" action="">

<div class="links">

    <h2 class="title"><i class="fas fa-id-card-alt"></i>Welcome Your Process Sucessfuly Finish </h2>
    <br>

   
</div>

<div class="input-box">
    <h3 class="title"> _________________________________</h3>
     
    <h3 class="title">         _________________        </h3>
    <h3 class="title"> _______   ________  _____________</h3>
    <h3 class="title"> _____________      ______________</h3>
    <h3 class="title">    ___________________________   </h3>

    <!-- <input type="submit" value="sing in" class="sing-in-btn">-->

     <!--<input type="submit" name="regi" class="sing-in-btn" value="Save">
     <input type="submit" name="regi" class="sing-in-btn" value="get-Screen shot">
     <input type="submit" name="regi" class="sing-in-btn" value="Next">-->

     <a href=" " class="lll">  </a>
     <a href="index_2.html" class="lll"> Okey </a>
     <a href=" " class="lll">  </a>
     

</div>


    </form>
</div>

<table>

<thead class="table-dark">
    <tr>
      <th scope="col">Product ID</th>
      <th scope="col">Name</th>
      <th scope="col">Quality</th>
      <th scope="col">Price</th>
      <th scope="col">Delivery Date</th>
    </tr>
  </thead>
  

<tbody>




<%

try{
	
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from customer_product";
resultSet = statement.executeQuery(sql);

while(resultSet.next()){
%>

<tr>

<td><%=resultSet.getString("product_id") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("Quality") %></td>
<td><%=resultSet.getString("price") %></td>
<td><%=resultSet.getString("delivery_date") %></td>

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