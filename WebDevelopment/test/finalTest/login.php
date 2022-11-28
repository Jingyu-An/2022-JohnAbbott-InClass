<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Login</title>
    <link rel="stylesheet" href="styles/style.css"/>
  </head>
  <body>
    <?php
      require('dbconfig.php');
      session_start();
      // If form submitted, insert values into the database.
      if (isset($_POST['id'])) {
        // removes backslashes
        $id = stripslashes($_REQUEST['id']);
        //escapes special characters in a string
        $id = mysqli_real_escape_string($con, $id);
        $password = stripslashes($_REQUEST['password']);
        $password = mysqli_real_escape_string($con, $password);
        //Checking is user existing in the database or not
        $query = "SELECT * FROM `teacher` WHERE id='$id' and password='" . md5($password) . "'";
        $result = mysqli_query($con, $query) or die(mysql_error());
        $rows = mysqli_num_rows($result);
        if ($rows == 1) {
          $_SESSION['id'] = $id;
          // Redirect user to index.php
          header("Location: view.php");
        } else {
          echo "<div class='form'><h3>Username/password is incorrect.</h3><br/>Click here to <a href='login.php'>Login</a></div>";
        }
      } else {
        ?>
        <div class="form">
          <h1>Log In</h1>
          <form action="" method="post" name="login">
            <input type="text" name="id" placeholder="Staff ID" required/>
            <input type="password" name="password" placeholder="Password" required/>
            <input name="submit" type="submit" value="Login"/>
          </form>
          <p>Not registered yet? <a href='registration.php'>Register Here</a></p>
        </div>
      <?php } ?>
  </body>
</html>