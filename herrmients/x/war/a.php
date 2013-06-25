<?php
//header('Content-type: application/json');
$message=$_GET['message'];
$jsondata['message'] = "El message es:\n".$message;
echo $_GET['callback'] . '('.json_encode($jsondata).')';
?>

