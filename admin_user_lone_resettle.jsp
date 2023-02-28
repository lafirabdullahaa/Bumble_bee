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

    <a href="#" class="logo">   <i class="fab fa-pied-piper-hat"></i> Bumble bee: Customer Loan - Installment details  </a> 

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
      <th scope="col">Customer ID</th>
      <th scope="col">Full name</th>
      <th scope="col">count-1.2.3</th>
      <th scope="col">D or C</th>
      <th scope="col">Card-holder-name</th>
      <th scope="col">Card-no</th>
      <th scope="col">Date</th>
      <th scope="col">Security-code</th>
      <th scope="col">Installment- amount</th>
      <th scope="col">Debit</th>
      <th scope="col">Credit</th>
      
      
    </tr>
  </thead>

  <tbody>
    <tr >
      <th scope="col"> B2-X71640129</th>
      <th scope="col"> joshes alex</th>
      <th scope="col">2</th>
      <th scope="col">Debit </th>
      <th scope="col">Robinsen Albert </th>
      <th scope="col">7852 6987 4123 0315</th>
      <th scope="col"> 01/15/2023</th>
      <th scope="col"> 717</th>
      <th scope="col">15000</th>
      <th scope="col"> 5000</th>
       <th scope="col">10000</th>
    </tr>


    <tr>
      <th scope="col"> B2-X71640130</th>
      <th scope="col"> jency jebrial</th>
      <th scope="col">2 </th>
      <th scope="col">Credit </th>
      <th scope="col">kalki jebrial</th>
      <th scope="col"> 2456 3214 8965 0126</th>
      <th scope="col"> 01/28/2023</th>
      <th scope="col"> 129</th>
      <th scope="col">15000 </th>
      <th scope="col"> 5000</th>
      <th scope="col"> 5000</th>

    </tr>


    <tr>
      <th scope="col"> B2-X71640131</th>
      <th scope="col"> mahthikalideen</th>
      <th scope="col"> 3</th>
      <th scope="col"> Debit</th>
      <th scope="col"> mahthikalideen</th>
      <th scope="col">6352 4896 2301 7965 </th>
      <th scope="col"> 02/19/2023</th>
      <th scope="col"> 673</th>
      <th scope="col">15000 </th>
      <th scope="col">5000 </th>
      <th scope="col">0</th>
      
    </tr>

    <tr>
      <th scope="col"> B2-X71640132</th>
      <th scope="col">salemanfarees </th>
      <th scope="col"> 2</th>
      <th scope="col">Debit </th>
      <th scope="col">salemanfarees </th>
      <th scope="col"> 3654 2156 7452 0102</th>
      <th scope="col"> 02/23/2023</th>
      <th scope="col"> 043</th>
      <th scope="col"> 15000</th>
      <th scope="col"> 5000</th>
      <th scope="col">5000 </th>
      
    </tr>


    <tr>
      <th scope="col"> B2-X71640133</th>
      <th scope="col"> dhiyaselvam</th>
      <th scope="col"> 1</th>
      <th scope="col"> Credit</th>
      <th scope="col"> Dhiyadevahar </th>
      <th scope="col"> 9875 6320 1452 3658</th>
      <th scope="col"> 02/24/2023</th>
      <th scope="col"> 157</th>
      <th scope="col"> 15000</th>
      <th scope="col"> 5000</th>
      <th scope="col"> 10000</th>
      
    </tr>


    <tr>
      <th scope="col"> B2-X71640134</th>
      <th scope="col">Abdullah </th>
      <th scope="col">2 </th>
      <th scope="col">Debit </th>
      <th scope="col">abdullaking </th>
      <th scope="col"> 9632 5874 5632 1452</th>
      <th scope="col">03/23/2023 </th>
      <th scope="col"> 311</th>
      <th scope="col"> 15000</th>
      <th scope="col">5000 </th>
      <th scope="col">5000 </th>
      
    </tr>


<%
try{
	
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from customer_installment_details";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<tr>
<td><%=resultSet.getString("customer_id") %></td>
<td><%=resultSet.getString("full_name") %></td>
<td><%=resultSet.getString("count_1_2_3") %></td>
<td><%=resultSet.getString("debit_or_credit") %></td>
<td><%=resultSet.getString("card_holder_name") %></td>
<td><%=resultSet.getString("card_no") %></td>
<td><%=resultSet.getString("date") %></td>
<td><%=resultSet.getString("security_code") %></td>
<td><%=resultSet.getString("installment_amount") %></td>
<td><%=resultSet.getString("debit_amount") %></td>
<td><%=resultSet.getString("creit_amount") %></td>
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