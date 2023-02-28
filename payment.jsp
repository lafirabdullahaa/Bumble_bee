

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="https://kit.fontawesome.com/766d21d255.js" crossorigin="anonymous"></script>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bumble bee: Buy first and pay later</title>

    <link rel="stylesheet" href="css/payment.css">
</head>
<body>

    <div class="container">
    
    <form method="POST" action="">

<div class="links">

    <h2 class="title"><i class="fab fa-pied-piper-hat"></i>Installment Payment Part</h2>
    <br>

    <div class="buttons">
        <a href="#" class="btn"> <i class="fab fa-google"></i>google Pay</a>
        <a href="#" class="btn"> <i class="fab fa-apple"></i>Apple Pay</a>
        <a href="#" class="btn"> <i class="fab fa-amazon"></i>Amazon Pay</a>
        
        

    </div>
</div>

<div class="input-box">
    <h3 class="title"> _________________________________</h3>
     
    <div class="input">
        <span class="fas fa-bookmark"></span>  
        <input type="text" name="hname" placeholder="Card Holder Name" id="" required>
     </div>

    <div class="input">
        <span class="fas fa-quote-left"></span> 
        <input type="text" name="cno" placeholder="Card No" id="" required>
     </div>

     <!--<div class="form-check">
        <input class="form-check-input" type="radio" name="rdo" >
        <label class="form-check-label" >
          Cradit <i class="fas fa-credit-card"></i>
        </label>
      </div>

      <div class="form-check">
        <input class="form-check-input" type="radio" name="rdo"  >
        <label class="form-check-label" >
          Debit <i class="far fa-credit-card"></i>
        </label>
      </div>-->

      <input type="radio" name="ab" value="Cradit">Cradit <i class="fas fa-credit-card"></i>

      <input type="radio" name="ab" value="Debit"> Debit <i class="far fa-credit-card"></i>

      <div class="input">
        <span class="far fa-calendar-alt"></span>  
        <input type="date" name="date" placeholder="Expiry Month" id="" required>
     </div>

     
     <div class="input">
        <span class="fas fa-qrcode"></span>  
        <input type="number" name="code" placeholder="Security Code" id="" required>
     </div>



     <div class="checkbox">
         <input type="checkbox" name="" id="remember" required>
         <label for="remember">It's Are Correcct</label>
     </div>

    <!-- <input type="submit" value="sing in" class="sing-in-btn">-->

     
     <!--<input type="submit" name="regi" class="sing-in-btn" value="-">-->
     <a href="payment_2.html" class="lll"> Process </a>

</div>


    </form>
</div>

</body>
</html>