<?php
  $id = $_POST["ID"];
  $title = $_POST["title"];
  $prequest = $_POST["Prerequest"];
  $con = mysqli_connect("localhost", "elymambou", "elymambou")
  or die("can not establish connection");
  mysqli_select_db($con, "my_db1");
  $statment1 = "insert into courses(Code,Title,prerequest)values('$id','$title','$prequest')";
  $flag = mysqli_query($con, $statment1);
  if ($flag) {
    echo "Record added Successfully";
  } else {
    die("Can not add Record" . mysqli_error());
  }
?>