<html>
  <body>
    <?php
      // define variables and set to empty values
      $countryErr = $countryCodeErr = $postalCodeErr = "";
      $country = $countryCode = $postalCode = "";
      if ($_SERVER["REQUEST_METHOD"] == "POST") {
        if (empty($_POST["country"])) {
          $countryErr = " * Country is required";
        } else {
          $country = test_input($_POST["country"]);
          if (!preg_match("/^[A-Z]{1,15}$/", $country)) {
            $countryErr = "Only capital letters allowed, up to 15 characters [input : $country]";
            $country = "Invalid country";
          }
        }
        if (empty($_POST["countryCode"])) {
          $countryCodeErr = " * Country dialing code is required";
        } else {
          $countryCode = test_input($_POST["countryCode"]);
          if (!preg_match("/^(\++[1-9]{1,3})$/", $countryCode)) {
            $countryCodeErr = "Invalid country dialing code format [input : $countryCode]";
            $countryCode = "Invalid country code";
          }
        }
        
        if (empty($_POST["postalCode"])) {
          $postalCodeErr = " * Postal code is required";
        } else {
          $postalCode = test_input($_POST["postalCode"]);
          if (!preg_match("/^([A-Z]+[0-9]+[A-Z]+[0-9]+[A-Z]+[0-9])$/", $postalCode)) {
            $postalCodeErr = "Invalid postal coed format [input : $postalCode]";
            $postalCode = "Invalid postal code";
          }
        }
      }
      function test_input($data)
      {
        $data = trim($data);
        $data = stripslashes($data);
        $data = htmlspecialchars($data);
        return $data;
      }
    
    ?>
    
    <form method="post" action="<?php echo $_SERVER["PHP_SELF"]; ?>">
      COUNTRY: <input type="text" name="country">
      <span class="error"><?php echo $countryErr; ?></span>
      <br><br>
      COUNTRY DIALING CODE:
      <input type="text" name="countryCode">
      <span class="error"><?php echo $countryCodeErr; ?></span>
      <br><br>
      POSTAL CODE: <input type="text" name="postalCode">
      <span class="error"><?php echo $postalCodeErr; ?></span>
      <br><br>
      <input type="submit" name="submit" value="Submit"> <br><br>
    </form>
    
    <hr>
    COUNTRY : <b><?php echo $country; ?></b> <br>
    COUNTRY DIALING CODE : <b><?php echo $countryCode ?></b> <br>
    POSTAL CODE : <b><?php echo $postalCode ?></b>
    
  </body>
</html>
