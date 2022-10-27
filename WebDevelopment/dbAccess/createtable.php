<?php
  $con = mysqli_connect("localhost", "elymambou", "elymambou");
  if (!$con) {
    die("Connection error:" . mysqli_connect_errno());
  }
  //Createdatabase
  /*if(mysqli_query($con,"CREATE DATABASE $db"))
  {  echo "Database created";}
  else{
  echo "Error creating database: ".mysqli_error($con);}*/
  //Createtable
  $db = "my_db1";
  mysqli_select_db($con, $db);
  
  
  $sql = "CREATE TABLE Courses1 (Code varchar(7), Title varchar(25),prerequest varchar(10))";
  //Executequery
  $flag1 = mysqli_query($con, $sql);
  if ($flag1) {
    echo "table was created";
  } else {
    die("table not create" . mysqli_error($con));
  }
  //insert into Courses1 table
  $statment1 = "insert into Courses1(Code,Title,prerequest)values('cs234','AI','CS244')";
  $statment2 = "insert into Courses1(Code,Title,prerequest)values('we6ab','PHP','Java')";
  
  $flag = mysqli_query($con, $statment1);
  if ($flag) {
    echo "sql statment excuted";
  } else {
    die("sql statment NOT excuted" . mysqli_error($con));
  }
  
  $flag = mysqli_query($con, $statment2);
  if ($flag) {
    echo "sql statment excuted\n";
  } else {
    die("sql statment NOT excuted" . mysqli_error($con));
  }
  
  mysqli_close($con);
?>
