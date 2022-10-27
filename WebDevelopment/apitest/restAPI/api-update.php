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
  echo $query = "UPDATE products SET product_name= '".$pName."' ,
  product_price= '".$pPrice."', product_description= '".$pDescription."', 
  product_categories = '".$pCategory."', product_company_name= '".$pCompanyName."'
  WHERE product_date='".$pDate."' ";
  if(mysqli_query($conn, $query) or die("Update Query Failed"))
  {
    echo json_encode(array("message" => "Product Update Successfully", "status" => true));
  }
  else
  {
    echo json_encode(array("message" => "Failed Product Not Updated", "status" => false));
  }
?>