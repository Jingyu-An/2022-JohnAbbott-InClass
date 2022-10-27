<html>
  <head></head>
  <body>
    <h1>Coast City Bowling Tournament</h1>
    <?php
      $person = array('first_name', 'last_name', 'grade_course', 'dob', 'gender');
      $BowlersFile = "person.txt";
      $NewBowler = "";
      foreach ($person as $item) {
        if (isset($_GET[$item])) {
          $personInfo = $_GET[$item];
          $NewBowler .= $personInfo ."\t";
        }
      }
      if (file_put_contents($BowlersFile, $NewBowler, FILE_APPEND) > 0) {
        $NewBowler .= "\r\n\r\n";
      }
    ?>
    <form action="fileHandiling.php" method="get" enctype="application/x-www-form-urlencoded">
      <p>First Name: <input type="text" name="first_name" size="30" required></p>
      <p>Last Name: <input type="text" name="last_name" size="30" required></p>
      <p>Grade Course: <input type="number" name="grade_course" size="30" required></p>
      <p>Date Of Birth: <input type="date" name="dob" size="30" required></p>
      <p>Gender:
      <input type="radio" name="gender" value="female">female
        <input type="radio" name="gender" value="male">male </p>
      <p><input type="submit" value="Register"/></p>
    </form>
  </body>

</html>
