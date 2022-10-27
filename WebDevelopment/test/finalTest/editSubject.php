<?php
  require('dbconfig.php');
  include("auth.php");
  $id = $_REQUEST['id'];
  $query = "SELECT * from subjects where code='" . $id . "'";
  $result = mysqli_query($con, $query) or die (mysqli_error());
  $row = mysqli_fetch_assoc($result);
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Update Subject</title>
    <link rel="stylesheet" href="styles/style.css"/>
  </head>
  <body>
    <div class="form">
      <h1>Update Subject</h1>
      <?php
        $status = "";
        if (isset($_POST['new']) && $_POST['new'] == 1)
        {
          $code = $_REQUEST['code'];
          $name = $_REQUEST['name'];
          $sdate = $_REQUEST['sdate'];
          $credit = $_REQUEST['credit'];
          $update = "update subjects set name='" . $name . "',
          sdate='" . $sdate . "', credits='" . $credit . "' where code='" . $code . "'";
          mysqli_query($con, $update) or die(mysqli_error());
          $status = "Record Updated Successfully. </br></br><a href='view.php'>View Updated Record</a>";
          echo '<p style="color:#FF0000;">' . $status . '</p>';
        }else {
      ?>
      <div>
        <form name="form" method="post" action="">
          <input type="hidden" name="new" value="1"/>
          <p><input name="code" type="hidden" value="<?php echo $row['code']; ?>"/></p>
          <p><input type="text" name="name" placeholder="Enter Subject Name"
                    required value="<?php echo $row['name']; ?>"/></p>
          <p><input type="date" name="sdate" placeholder="Enter Start Date"
                    required value="<?php echo $row['sdate']; ?>"/></p>
          <p><input type="number" name="credit" placeholder="Enter Credit"
                    required value="<?php echo $row['credits']; ?>"/></p>
          <p><input name="submit" type="submit" value="Update"/></p>
        </form>
        <?php } ?>
      </div>
      <p><a href="logout.php">Logout</a></p>
    </div>
  </body>
</html>
