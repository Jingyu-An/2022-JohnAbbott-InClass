<?php
  require('db.php');
  include("auth.php");
  $status = "";
  if(isset($_POST['new']) && $_POST['new']==1){
    $trn_date = date("Y-m-d H:i:s");
    $code =$_REQUEST['code'];
    $title = $_REQUEST['title'];
    $credit =$_REQUEST['credit'];
    $teacher =$_REQUEST['teacher'];
    $semester = $_REQUEST['semester'];
    $year = $_REQUEST['year'];
    $submittedby = $_SESSION["username"];
    $ins_query="insert into course
    (`trn_date`,`code`,`title`,`credit`,`teacher`,`semester`,`year`,`submittedby`)values
    ('$trn_date','$code','$title','$credit','$teacher','$semester','$year','$submittedby')";
    mysqli_query($con,$ins_query)
    or die(mysql_error());
    $status = "New Course Inserted Successfully.
    </br></br><a href='viewCourses.php'>View Inserted Course</a>";
  }
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Insert New Course</title>
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body>
    <div class="form">
      <p><a href="dashboard.php">Dashboard</a>
        | <a href="view.php">View Records</a>
        | <a href="viewCourses.php">View Courses</a>
        | <a href="logout.php">Logout</a></p>
      <div>
        <h1>Insert New Course</h1>
        <form name="form" method="post" action="">
          <input type="hidden" name="new" value="1" />
          <p><input type="number" name="code" placeholder="Enter Code 4 digits" required /></p>
          <p><input type="text" name="title" placeholder="Enter Title" required /></p>
          <p><input type="number" name="credit" placeholder="Enter Credit" required /></p>
          <p><input type="text" name="teacher" placeholder="Enter Teacher" required /></p>
          <p>
            <strong>Select Semester</strong> <br><br>
            <input type="radio" name="semester" value="FALL" /> Fall
            <input type="radio" name="semester" value="SUMMER" /> Summer
            <input type="radio" name="semester" value="WINTER" /> Winter
          </p>
          <p>
            <strong>Select Year</strong> <br><br>
            <input type="radio" name="year"  value="2021" /> 2021
            <input type="radio" name="year"  value="2022" /> 2022
          </p>
          <p><input name="submit" type="submit" value="Submit" /></p>
        </form>
        <p style="color:#FF0000;"><?php echo $status; ?></p>
      </div>
    </div>
  </body>
</html>
