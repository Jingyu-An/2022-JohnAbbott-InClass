<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Registration</title>
    <link rel="stylesheet" href="styles/style.css" type="text/css"/>
  </head>
  <body>
    <?php
      $idErr = $phoneErr = "";
      $id = $phone = "";
      if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $id = test_input($_POST["id"]);
        if (strlen($id) != 4) {
          $idErr = "Only 4 digits allowed";
        }

        $phone = test_input($_POST["phone"]);
        if (strlen($phone) != 10) {
          $phoneErr = "Only 10 digits allowed";
        }
      }

      function test_input($data)
      {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
      }

      require('dbconfig.php');

      if (isset($_REQUEST['id'])) {
        $id = stripslashes($_REQUEST['id']);
        $id = mysqli_real_escape_string($con, $id);
        $name = stripslashes($_REQUEST['name']);
        $name = mysqli_real_escape_string($con, $name);
        $email = stripslashes($_REQUEST['email']);
        $email = mysqli_real_escape_string($con, $email);
        $dob = stripslashes($_REQUEST['dob']);
        $dob = mysqli_real_escape_string($con, $dob);
        $phone = stripslashes($_REQUEST['phone']);
        $phone = mysqli_real_escape_string($con, $phone);
        $password = stripslashes($_REQUEST['password']);
        $password = mysqli_real_escape_string($con, $password);


        $query = "INSERT into `teacher` (id, name, email, dob, phone, password)
            VALUES ('$id', '$name', '$email', '$dob', '$phone', '" . md5($password) . "')";
        $result = mysqli_query($con, $query);

        if ($result) {
          echo "<div class='form'><h3>You are registered successfully.</h3><br/>Click here to <a href='login.php'>Login</a></div>";
        } else {
          echo "<div class='form'><h3>You are registered fail.</h3></div>";
        }
      } ?>
    <div class="form">
      <h1>Registration</h1>
      <form name="registration" method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
        <input type="number" name="id" placeholder="Staff ID" />
        <br><span class="error" style="color: red"> <?php echo $idErr; ?></span><br>
        <input type="text" name="name" placeholder="Name" required/>
        <input type="email" name="email" placeholder="Email" required/>
        <input type="date" name="dob" placeholder="Date of birth" required/>
        <input type="tel" name="phone" placeholder="Phone" />
        <br><span class="error" style="color: red"> <?php echo $phoneErr; ?></span><br>
        <input type="password" name="password" placeholder="Password" required/>
        <input type="submit" name="submit" value="Register"/>
      </form>
      <p><a href='login.php'>Log In Here</a></p>
    </div>
  </body>
</html>