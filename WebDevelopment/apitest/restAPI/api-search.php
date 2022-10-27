<?php
  header("Content-Type: application/json");
  $data = json_decode(file_get_contents("php://input"), true);
  $pId = $data["id"];
  require_once "dbconfig.php";
  echo $query = "SELECT * FROM products WHERE product_id LIKE '%".$pId."%' ";
  $result = mysqli_query($conn, $query) or die("Search Query Failed.");
  $response=array();
  if($result){
    $x=0;
    while($row=mysqli_fetch_assoc($result))
    {
      $response[$x]['product_id']=$row['product_id'];
      $response[$x]['product_name']=$row['product_name'];
      $response[$x]['product_price']=$row['product_price'];
      $response[$x]['product_description']=$row['product_description'];
      $response[$x]['product_date']=$row['product_date'];
      $response[$x]['product_categories']=$row['product_categories'];
      $response[$x]['product_company_name']=$row['product_company_name'];
      $x++;
    }
    echo json_encode($response, JSON_PRETTY_PRINT);
  }
  else
  {
    echo json_encode(array("message" => "No Search Found.", "status" => false));
  }
?>