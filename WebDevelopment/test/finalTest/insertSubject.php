<?php
  $codeErr = $creditErr = "";
  $code = $credit = "";
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $code = test_input($_POST["code"]);
    if (strlen($code) != 6) {
      $codeErr = "Only 6 chars allowed";
    }

    $credit = test_input($_POST["credit"]);
    if ($credit < 0 || $credit > 4) {
      $creditErr = "Positive integer between 0 to 4 allowed";
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
  include("auth.php");
  $status = "";
  if (isset($_POST['new']) && $_POST['new'] == 1) {
    $code = $_REQUEST['code'];
    $name = $_REQUEST['name'];
    $sdate = $_REQUEST['sdate'];
    $credit = $_REQUEST['credit'];
    $ins_query = "insert into subjects (`code`,`name`,`sdate`,`credits`) values ('$code','$name','$sdate','$credit')";
    $result = mysqli_query($con, $ins_query);
    if ($result) {
      $status = "New Record Inserted Successfully. </br></br><a href='view.php'>View Inserted Record</a>";
    }
  }
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Insert New Subject</title>
    <link rel="stylesheet" href="styles/style.css"/>
  </head>
  <body>
    <div class="form">
      <div>
        <h1>Insert New Subject</h1>
        <form name="form" method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
          <input type="hidden" name="new" value="1"/>
          <p><input type="text" name="code" placeholder="Enter CODE" /></p>
          <span class="error" style="color: red"> <?php echo $codeErr; ?></span>
          <p><input type="text" name="name" placeholder="Enter Subject Name" required/></p>
          <p><input type="date" name="sdate" placeholder="Enter Start Date" required/></p>
          <p><input type="number" name="credit" placeholder="Enter Credit" /></p>
          <span class="error" style="color: red"> <?php echo $creditErr; ?></span>
          <p><input name="submit" type="submit" value="Submit"/></p>
        </form>
        <p style="color:#FF0000;"><?php echo $status; ?></p>
        <p><a href="logout.php">Logout</a></p>
      </div>
    </div>
  </body>
</html>
