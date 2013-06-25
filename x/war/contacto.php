 <?php
$Nombre=$_GET['nome'];
$Correo=$_GET['email'];
$Telefono=$_GET['telefono'];
$NIF=$_GET['cf'];
$comentarios=$_GET['questione'];
$toaddress ='victorcasassm@gmail.com';
$asunto='Consulta online formulada';
$mensaje=
' Nombre y apellidos:'.$Nombre."\n"
."Email:\n".$Correo."\n"
.'Telefono:'.$Telefono."\n"
.'Nif/Cif:'.$NIF."\n"
."Consulta:\n".$comentarios."\n";
$fromaddress='From: Asesoria Legal Casas';
mail($toaddress,$asunto,$mensaje,$fromaddress);
echo "<nav><h2>¡Hemos recibido su consulta!</h2>
<p>En breve le daremos una respuesta.</p></nav>";?>