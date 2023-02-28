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

    <a href="#" class="logo">   <i class="fab fa-pied-piper-hat"></i> -- Bumble bee: -- Customer Registeration Details  <i class="fab fa-pied-piper-hat"></i> </a> 

    <nav class="nevbar">
        <a href="Admin_.html">Home </a>
        
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
      <th scope="col">Full Name</th>
      <th scope="col">Date of Birth</th>
      <th scope="col">Age</th>
      <th scope="col">City</th>
      <th scope="col">Address</th>
      <th scope="col">Email</th>
      <th scope="col">Phone Number</th>
      <th scope="col">User-Name</th>
      <th scope="col">Password</th>
      <th scope="col">Conform Password</th>
      <th scope="col">Gender</th>

    </tr>
  </thead>

  <tbody>
    <tr >
      <th scope="col"> Abdullah</th>
      <th scope="col"> 09.09.2003</th>
      <th scope="col"> 19</th>
      <th scope="col"> Colombo</th>
      <th scope="col"> 215,Taylor street,colombo</th>
      <th scope="col"> Abdullah784king@outlook.com</th>
      <th scope="col"> +94 789 521003</th>
      <th scope="col"> abd_king_0opi0</th>
      <th scope="col"> 145280</th>
      <th scope="col"> 145280</th>
      <th scope="col">Male</th>
    </tr>

    <tr >
      <th scope="col"> jorje</th>
      <th scope="col"> 02.07.2000</th>
      <th scope="col"> 22</th>
      <th scope="col"> Batticalo</th>
      <th scope="col"> 15,main street,Batticalo</th>
      <th scope="col"> jorjeferenano@gmail.com</th>
      <th scope="col"> +94 770015324</th>
      <th scope="col"> jorje78965</th>
      <th scope="col"> 301024</th>
      <th scope="col"> 301024</th>
      <th scope="col">Male</th>
    </tr>


    <tr >
      <th scope="col"> MAhthi</th>
      <th scope="col"> 03.10.2004</th>
      <th scope="col"> 18</th>
      <th scope="col"> Kandy</th>
      <th scope="col"> 30/7,muhaideen street,Kandy</th>
      <th scope="col"> mahthikalideen78@gmail.com</th>
      <th scope="col"> +94 769654102</th>
      <th scope="col"> mk452103</th>
      <th scope="col"> 968523</th>
      <th scope="col"> 968523</th>
      <th scope="col">Male</th>
    </tr>


    <tr >
      <th scope="col"> Dhiya</th>
      <th scope="col"> 07.04.2003</th>
      <th scope="col"> 19</th>
      <th scope="col"> Batticalo</th>
      <th scope="col"> 201,selverasa street,colombo</th>
      <th scope="col"> dhiyaselvam@gmail.com</th>
      <th scope="col"> +94 770123695</th>
      <th scope="col"> dhiya5321pq9</th>
      <th scope="col"> 027630</th>
      <th scope="col"> 027630</th>
      <th scope="col">Female</th>
    </tr>


    <tr >
      <th scope="col"> Jency jebrial</th>
      <th scope="col"> 10.11.2003</th>
      <th scope="col"> 19</th>
      <th scope="col"> Batticalo</th>
      <th scope="col"> 12/3,olive street,colombo</th>
      <th scope="col"> jencyabd@gmail.com</th>
      <th scope="col"> +94 786325410</th>
      <th scope="col"> jency710op</th>
      <th scope="col"> 785210</th>
      <th scope="col"> 785210</th>
      <th scope="col">Female</th>
    </tr>


    <tr >
      <th scope="col"> salman faris</th>
      <th scope="col"> 09.04.2001</th>
      <th scope="col"> 21</th>
      <th scope="col"> Colombo</th>
      <th scope="col"> 110,moor street,colombo</th>
      <th scope="col"> salemanfarees@yahoo.com</th>
      <th scope="col"> +94 778855120</th>
      <th scope="col"> farees_09285</th>
      <th scope="col"> 785621</th>
      <th scope="col"> 785621</th>
      <th scope="col">Male</th>
    </tr>


<%

try{
	
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from customer_registration";
resultSet = statement.executeQuery(sql);

while(resultSet.next()){
%>

<tr>

<td><%=resultSet.getString("full_name") %></td>
<td><%=resultSet.getString("date_of_birth") %></td>
<td><%=resultSet.getString("age") %></td>
<td><%=resultSet.getString("city") %></td>
<td><%=resultSet.getString("address") %></td>
<td><%=resultSet.getString("email") %></td>
<td><%=resultSet.getString("phone_number") %></td>
<td><%=resultSet.getString("user_name") %></td>
<td><%=resultSet.getString("password") %></td>
<td><%=resultSet.getString("confirm_password") %></td>
<td><%=resultSet.getString("gender") %></td>

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