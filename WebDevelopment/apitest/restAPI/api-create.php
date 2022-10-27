<?php
  header("Content-Type: application/json");
  $data = json_decode(file_get_contents("php://input"), true);
  $pName = $data["name"];
  $pPrice = $data["price"];
  $pDescription = $data["desc"];
  $pDate = $data["date"];
  $pCategory = $data["category"];
  $pCompanyName = $data["cName"];
  require_once "dbconfig.php";
  $query = "INSERT INTO products (product_name, product_price, product_description, 
                      product_date, product_categories, product_company_name)
            VALUES ('" . $pName . "', '" . $pPrice . "', '" . $pDescription . "',
             '" . $pDate . "', '" . $pCategory . "', '" . $pCompanyName . "')";
  if (mysqli_query($conn, $query) or die("Insert Query Failed")) {
    echo json_encode(array("message" => "Product Inserted Successfully", "status" => true));
  } else {
    echo json_encode(array("message" => "Failed Product Not Inserted ", "status" => false));
  }
?>