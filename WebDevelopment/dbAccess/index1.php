<?php
  $con = mysqli_connect("localhost", "root", "", "testing");
//Check connection
  if (!$con) {
    die("Connection error:" . mysqli_connect_errno());
  } else
    echo "Connection successful";
?>