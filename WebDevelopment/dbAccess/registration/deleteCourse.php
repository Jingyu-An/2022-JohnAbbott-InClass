<?php
  require('db.php');
  $code=$_REQUEST['code'];
  $query = "DELETE FROM course WHERE code=$code";
  $result = mysqli_query($con,$query) or die ( mysqli_error());
  header("Location: viewCourses.php");
?>
