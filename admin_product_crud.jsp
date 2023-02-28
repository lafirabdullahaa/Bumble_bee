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

    <a href="#" class="logo">   <i class="fab fa-pied-piper-hat"></i> -- Bumble bee: Product  <i class="fab fa-pied-piper-hat"></i> </a> 

    <nav class="nevbar">
        <a href="Admin_.html">Home </a>
        <a href="#" class=""> Insert</a>
        <a href="#" class=""> Update</a>
        <a href="#" class=""> Select</a>
        <a href="#" class=""> Delete</a>
        
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

  <div class="input">
    <label class="btn">Product ID</label>
    <span class="far fa-use"></span>
    <input type="text" name="uname" class="btn" placeholder="" id="" required>

    <label class="btn">Name___</label>
    <span class="far fa-use"></span>
    <input type="text" name="uname" class="btn" placeholder="" id="" required> 

    <label class="btn">Quality__</label>
    <span class="far fa-use"></span>
    <input type="text" name="uname" class="btn" placeholder="" id="" required>


  </div>
  
  
  <div class="input">
    <label class="btn">Price___</label>
    <span class="far fa-use"></span>
    <input type="text" name="uname" class="btn" placeholder="" id="" required> 
  </div>
  <br>

  

</section>
<!--service section End-->

<table class="table">
  <thead class="table-dark">
    <tr>
      <th scope="col">Product ID</th>
      <th scope="col">Name</th>
      <th scope="col">Quality</th>
      <th scope="col">Price</th>
    </tr>
  </thead>

  <tbody>
    <tr >
      <th scope="col"> Px-75a4a78</th>
      <th scope="col"> sam Tampet g1p</th>
      <th scope="col">H</th>
      <th scope="col">3300</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a79</th>
      <th scope="col"> sam Tampet Q9</th>
      <th scope="col">M</th>
      <th scope="col">2750</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a80</th>
      <th scope="col"> sam Tampet Q7</th>
      <th scope="col">H</th>
      <th scope="col">3900</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a81</th>
      <th scope="col"> sam Tampet g8</th>
      <th scope="col">H</th>
      <th scope="col">3350</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a82</th>
      <th scope="col"> sam Tampet 75VS0</th>
      <th scope="col">M</th>
      <th scope="col">2000</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a83</th>
      <th scope="col"> sam Tampet 75Gal</th>
      <th scope="col">M</th>
      <th scope="col">1800</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a84</th>
      <th scope="col"> sam Tampet PPQ7</th>
      <th scope="col">H</th>
      <th scope="col">3150</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a85</th>
      <th scope="col"> sam Tampet 78PQ</th>
      <th scope="col">M</th>
      <th scope="col">2850</th>
    </tr>
    <tr >
      <th scope="col"> Px-75a4a86</th>
      <th scope="col"> sam Tampet 47q</th>
      <th scope="col">H</th>
      <th scope="col">3800</th>
    </tr>



<%

try{
	
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from products_stock_admin";
resultSet = statement.executeQuery(sql);

while(resultSet.next()){
%>

<tr>

<td><%=resultSet.getString("product_id") %></td>
<td><%=resultSet.getString("name") %></td>
<td><%=resultSet.getString("quality") %></td>
<td><%=resultSet.getString("price") %></td>

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