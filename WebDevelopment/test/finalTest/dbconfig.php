<?php
  $DBhost = "localhost";
  $DBuser="root";
  $DBpassword="";
  $DBname="school";
  $con = mysqli_connect($DBhost, $DBuser, $DBpassword, $DBname);
  if(!$con){
    die("Connection failed: " . mysqli_connect_error());
  }
?>