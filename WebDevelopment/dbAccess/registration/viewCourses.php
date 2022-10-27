<?php
  require('db.php');
  include("auth.php");
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>View Courses</title>
    <link rel="stylesheet" href="css/style.css" />
  </head>
  <body>
    <div class="form">
      <p><a href="index.php">Home</a>
        | <a href="insert.php">Insert New Record</a>
        | <a href="insertCourse.php">Insert New Course</a>
        | <a href="view.php">View Records</a>
        | <a href="logout.php">Logout</a></p>
      <h2>View Courses</h2>
      <table width="100%" border="1" style="border-collapse:collapse;">
        <thead>
        <tr>
          <th><strong>S.No</strong></th>
          <th><strong>Code</strong></th>
          <th><strong>Title</strong></th>
          <th><strong>Credit</strong></th>
          <th><strong>Teacher</strong></th>
          <th><strong>Semester</strong></th>
          <th><strong>Year</strong></th>
          <th><strong>Edit</strong></th>
          <th><strong>Delete</strong></th>
        </tr>
        </thead>
        <tbody>
        <?php
          $count=1;
          $sel_query="Select * from course ORDER BY code desc;";
          $result = mysqli_query($con,$sel_query);
          while($row = mysqli_fetch_assoc($result)) { ?>
            <tr><td align="center"><?php echo $count; ?></td>
              <td align="center"><?php echo $row["code"]; ?></td>
              <td align="center"><?php echo $row["title"]; ?></td>
              <td align="center"><?php echo $row["credit"]; ?></td>
              <td align="center"><?php echo $row["teacher"]; ?></td>
              <td align="center"><?php echo $row["semester"]; ?></td>
              <td align="center"><?php echo $row["year"]; ?></td>
              <td align="center">
                <a href="editCourse.php?code=<?php echo $row["code"]; ?>">Edit</a>
              </td>
              <td align="center">
                <a href="deleteCourse.php?code=<?php echo $row["code"]; ?>">Delete</a>
              </td>
            </tr>
            <?php $count++; } ?>
        </tbody>
      </table>
    </div>
  </body>
</html>
