<?php
  header("Content-Type: application/json");
  $data = json_decode(file_get_contents("php://input"), true);
  $pName = $data["name"];
  require_once "dbconfig.php";
  echo $query = "DELETE FROM products WHERE product_name='".$pName."' ";
  if(mysqli_query($conn, $query) or die("Delete Query Failed"))
  {
    echo json_encode(array("message" => "Product Delete Successfully", "status" => true));
  }
  else
  {
    echo json_encode(array("message" => "Failed Product Not Deleted", "status" => false));
  }
?>