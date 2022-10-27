<form method="post" action="FormQuery.php">
  <p>CourseCode?</p>
  <select name="Course_Code">
    <option></option>
    <option>cs215</option>
    <option>cs231</option>
    <option>cs241</option>
  </select>
  <input type="submit" value="Check Prerequest"/>
  <input type="reset" value="ResetForm"/>
</form>
<?php
  $con = mysqli_connect("localhost", "elymambou", "elymambou", "my_db1")
  or die("can not establish connection");
?>
<?php
  if (isset($_POST["Course_Code"])) {
    $courseCode = $_POST['Course_Code'];
    $query = "SELECT prerequest from courses where Code='$courseCode'";
    $result = mysqli_query($con, $query);
    if (!($result)) {
      echo("Error:" . mysqli_error($con));
      die("Cannot execute" . mysqli_error());
    }
    $row = mysqli_fetch_array($result);
    $answer = $row["prerequest"];
    echo "<p>The Prerequest for $courseCode is $answer<p>";
  }
?>
</html>

 