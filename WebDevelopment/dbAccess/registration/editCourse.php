<?php
  require('db.php');
  include("auth.php");
  $code = $_REQUEST['code'];
  $query = "SELECT * from course where code='" . $code . "'";
  $result = mysqli_query($con, $query) or die (mysqli_error());
  $row = mysqli_fetch_assoc($result);
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Update Course</title>
    <link rel="stylesheet" href="css/style.css"/>
  </head>
  <body>
    <div class="form">
      <p><a href="dashboard.php">Dashboard</a>
        | <a href="insert.php">Insert New Record</a>
        | <a href="insertCourse.php">Insert New Course</a>
        | <a href="logout.php">Logout</a></p>
      <h1>Update Course</h1>
      <?php
        $status = "";
        if (isset($_POST['new']) && $_POST['new'] == 1)
        {
          $code = $_REQUEST['code'];
          $trn_date = date("Y-m-d H:i:s");
          $title = $_REQUEST['title'];
          $credit = $_REQUEST['credit'];
          $teacher = $_REQUEST['teacher'];
          $semester = $_REQUEST['semester'];
          $year = $_REQUEST['year'];
          $submittedby = $_SESSION["username"];
          $update = "update course set trn_date='" . $trn_date . "',
          title='" . $title . "', credit='" . $credit . "', year='" . $year . "',
          teacher='" . $teacher . "', semester='" . $semester . "',
          submittedby='" . $submittedby . "' where code='" . $code . "'";
          mysqli_query($con, $update) or die(mysqli_error());
          $status = "Course Updated Successfully. </br></br>
<a href='viewCourses.php'>View Updated Course</a>";
          echo '<p style="color:#FF0000;">' . $status . '</p>';
        }else {
      ?>
      <div>
        <form name="form" method="post" action="">
          <input type="hidden" name="new" value="1"/>
          <p><input type="hidden" name="code" value="<?php echo $row['code']; ?>"/></p>
          <p><input type="text" name="title"
                    required value="<?php echo $row['title']; ?>"/></p>
          <p><input type="number" name="credit"
                    required value="<?php echo $row['credit']; ?>"/></p>
          <p><input type="text" name="teacher"
                    required value="<?php echo $row['teacher']; ?>"/></p>
          <p>
            <strong>Select Semester</strong> <br><br>
            <input type="radio" name="semester" value="FALL"/> Fall
            <input type="radio" name="semester" value="SUMMER"/> Summer
            <input type="radio" name="semester" value="WINTER"/> Winter
          </p>
          <p>
            <strong>Select Year</strong> <br><br>
            <input type="radio" name="year" value="2021"/> 2021
            <input type="radio" name="year" value="2022"/> 2022
          </p>
          <p><input name="submit" type="submit" value="Update"/></p>
        </form>
        <?php } ?>
      </div>
    </div>
  </body>
</html>
