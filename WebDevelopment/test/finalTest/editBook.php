<?php
  require('dbconfig.php');
  include("auth.php");
  $id = $_REQUEST['id'];
  $query = "SELECT * from books where isbn='" . $id . "'";
  $result = mysqli_query($con, $query) or die (mysqli_error());
  $row = mysqli_fetch_assoc($result);
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Update Book</title>
    <link rel="stylesheet" href="styles/style.css"/>
  </head>
  <body>
    <div class="form">
      <h1>Update Book</h1>
      <?php
        $status = "";
        if (isset($_POST['new']) && $_POST['new'] == 1)
        {
          $isbn = $_REQUEST['isbn'];
          $title = $_REQUEST['title'];
          $price = $_REQUEST['price'];
          $author = $_REQUEST['author'];
          $dop = $_REQUEST['dop'];
          $update = "update books set title='" . $title . "',
          price='" . $price . "', author='" . $author . "',
          dop='" . $dop . "' where isbn='" . $isbn . "'";
          mysqli_query($con, $update) or die(mysqli_error());
          $status = "Record Updated Successfully. </br></br><a href='view.php'>View Updated Record</a>";
          echo '<p style="color:#FF0000;">' . $status . '</p>';
        }else {
      ?>
      <div>
        <form name="form" method="post" action="">
          <input type="hidden" name="new" value="1"/>
          <p><input name="isbn" type="hidden" value="<?php echo $row['isbn']; ?>"/></p>
          <p><input type="text" name="title" placeholder="Enter Title"
                    required value="<?php echo $row['title']; ?>"/></p>
          <p><input type="number" name="price" placeholder="Enter Price"
                    required value="<?php echo $row['price']; ?>"/></p>
          <p><input type="text" name="author" placeholder="Enter Author"
                    required value="<?php echo $row['author']; ?>"/></p>
          <p><input type="text" name="dop" placeholder="Enter Date of Publication"
                    required value="<?php echo $row['dop']; ?>"/></p>
          <p><input name="submit" type="submit" value="Update"/></p>
        </form>
        <?php } ?>
      </div>
      <p><a href="logout.php">Logout</a></p>
    </div>
  </body>
</html>
