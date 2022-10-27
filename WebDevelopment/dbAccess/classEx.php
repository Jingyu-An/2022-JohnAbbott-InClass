<?php
  $name = $_POST['name'];
  $surname = $_POST['surname'];
  $username = $_POST['username'];
  $password = $_POST['password'];
  $age = $_POST['age'];
  $dob = $_POST['date_birth'];
  $con = mysqli_connect("localhost", "jingyu", "12345", "my_db1", "8080");
  if (!$con) {
    echo "Error connecting  ";
    die("Connection error:" . mysqli_connect_errno());
  }
  mysqli_select_db($con, "my_db1");
  $statment1 = "insert into registration(Username,Name,Surname,Age,DateOfBirth,Password)values(
                     '$username','$name','$surname','$age','$dob','$password')";
  $flag = mysqli_query($con, $statment1);
  if ($flag) {
    echo "Record added Successfully";
  } else {
    die("Can not add Record" . mysqli_error($con));
  }
?>
