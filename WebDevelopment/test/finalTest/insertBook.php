<?php
  $isbnErr = $priceErr = "";
  $isbn = $price = "";
  if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $isbn = test_input($_POST["isbn"]);
    if (strlen($isbn) != 13) {
      $isbnErr = "Only 13 digits allowed";
    }

    $price = test_input($_POST["price"]);
    if ($price > 300 || $price < 0) {
      $priceErr = "Price up to 300 CAD allowed";
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
    $isbn = $_REQUEST['isbn'];
    $title = $_REQUEST['title'];
    $price = $_REQUEST['price'];
    $author = $_REQUEST['author'];
    $dop = $_REQUEST['dop'];
    $ins_query = "insert into books (`isbn`,`title`,`price`,`author`, `dop`) values ('$isbn','$title','$price','$author','$dop')";
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
    <title>Insert New Record</title>
    <link rel="stylesheet" href="styles/style.css"/>
  </head>
  <body>
    <div class="form">
      <div>
        <h1>Insert New Book</h1>
        <form name="form" method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
          <input type="hidden" name="new" value="1"/>
          <p><input type="number" name="isbn" placeholder="Enter ISBN" /></p>
          <span class="error" style="color: red"> <?php echo $isbnErr; ?></span>
          <p><input type="text" name="title" placeholder="Enter Title" required/></p>
          <p><input type="number" name="price" placeholder="Enter Price" /></p>
          <span class="error" style="color: red"> <?php echo $priceErr; ?></span>
          <p><input type="text" name="author" placeholder="Enter Author" required/></p>
          <p><input type="date" name="dop" placeholder="Enter Date of Publication" required/></p>
          <p><input name="submit" type="submit" value="Submit"/></p>
        </form>
        <p style="color:#FF0000;"><?php echo $status; ?></p>
        <p><a href="logout.php">Logout</a></p>
      </div>
    </div>
  </body>
</html>
