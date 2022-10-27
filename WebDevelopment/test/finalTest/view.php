<?php
  require('dbconfig.php');
  require('auth.php');
?>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Teacher Page</title>
    <link rel="stylesheet" href="styles/style.css" />
  </head>
  <body>
    <div class="form">
      <h2>Teacher Page</h2>
      <p> <a href="insertBook.php">Insert New Book</a>
      <table width="100%" border="1" style="border-collapse:collapse;">
        <thead>
        <tr>
          <th><strong>S.No</strong></th>
          <th><strong>ISBN</strong></th>
          <th><strong>Title</strong></th>
          <th><strong>Price</strong></th>
          <th><strong>Author</strong></th>
          <th><strong>Date Of publication</strong></th>
          <th><strong>Edit</strong></th>
        </tr>
        </thead>
        <tbody>
        <?php
          $count=1;
          $sel_query="Select * from books ORDER BY isbn desc;";
          $result = mysqli_query($con, $sel_query);
          while($row = mysqli_fetch_assoc($result)) { ?>
            <tr><td align="center"><?php echo $count; ?></td>
              <td align="center"><?php echo $row["isbn"]; ?></td>
              <td align="center"><?php echo $row["title"]; ?></td>
              <td align="center"><?php echo $row["price"]; ?></td>
              <td align="center"><?php echo $row["author"]; ?></td>
              <td align="center"><?php echo $row["dop"]; ?></td>
              <td align="center">
                <a href="editBook.php?id=<?php echo $row["isbn"]; ?>">Edit</a>
              </td>
            </tr>
            <?php $count++; } ?>
        </tbody>
      </table>
      <p> <a href="insertSubject.php">Insert New Subject</a>
      <table width="100%" border="1" style="border-collapse:collapse;">
        <thead>
        <tr>
          <th><strong>S.No</strong></th>
          <th><strong>Code</strong></th>
          <th><strong>Name</strong></th>
          <th><strong>Start Date</strong></th>
          <th><strong>Credit</strong></th>
          <th><strong>Edit</strong></th>
        </tr>
        </thead>
        <tbody>
        <?php
          $count=1;
          $sel_query="Select * from subjects ORDER BY code desc;";
          $result = mysqli_query($con, $sel_query);
          while($row = mysqli_fetch_assoc($result)) { ?>
            <tr><td align="center"><?php echo $count; ?></td>
              <td align="center"><?php echo $row["code"]; ?></td>
              <td align="center"><?php echo $row["name"]; ?></td>
              <td align="center"><?php echo $row["sdate"]; ?></td>
              <td align="center"><?php echo $row["credits"]; ?></td>
              <td align="center">
                <a href="editSubject.php?id=<?php echo $row["code"]; ?>">Edit</a>
              </td>
            </tr>
            <?php $count++; } ?>
        </tbody>
      </table>
      <p><a href="logout.php">Logout</a></p>
    </div>
  </body>
</html>
