<?php
  $con = mysqli_connect("localhost", "elymambou", "elymambou") or
  die("can not establish connection");
  
  mysqli_select_db($con, "my_db1");
  /*
  mysqli_query($con, "insert
  into courses1 (Code ,Title, prerequest) values('cs231','Web dev','CS234')");
  mysqli_query($con, "insert
  into courses1 (Code ,Title, prerequest) values('cs237','Web dev II','CS245')");
  mysqli_query($con, "insert
  into courses1 (Code ,Title, prerequest) values('cs215','Springboot','CS200')");
  mysqli_query($con, "insert
  into courses1 (Code ,Title, prerequest) values('cs241','Data structures','CS320')");
  */
  $statment1 = "SELECT* FROM courses1";
  $result = mysqli_query($con, $statment1);
  if (!($result)) {
    echo("Error: " . mysqli_error($con));
  }
  
  $num_rows = mysqli_num_rows($result);
  
  /*while($row=mysqli_fetch_array($result))
  {
  echo$row["Code"]."---";
  echo$row["Title"]."---";
  echo $row["prerequest"];
  echo"<br/>";
  }*/
  
  //
  for ($row_num = 0; $row_num < $num_rows; $row_num++) {
    $row = mysqli_fetch_array($result);
    print "<p>Result row number " . ($row_num + 1) . " Code: ";
    echo($row["Code"]);
    echo " Title:";
    echo($row["Title"]);
    
    echo " prerequest : ";
    echo($row["prerequest"]);
    echo "</p>";
  }
  
  
  mysqli_close($con);

?>

