 <?php
$a=$_GET['a'];
$m=$_GET['m'];
$d=$_GET['d'];
$a0=$_GET['a0'];
$m0=$_GET['m0'];
$d0=$_GET['d0'];
$url="http://calcula-penas.appspot.com/Resultados.action?a=".$a."&m=".$m."&d=".$d."&a0=".$a0."&m0=".$m0."&d0=".$d0;
$dom = new DOMDocument;
$dom->loadHTMLFile($url);
$xp = new DOMXpath($dom);
$nodes = $xp->query('//h2');
$respuesta= $nodes->item(0)->nodeValue;
$respuesta= str_replace("aÃ±o","año",$respuesta);
$respuesta= str_replace("dÃ­a","día",$respuesta);
$respuesta= str_replace("aÃ±os","años",$respuesta);
$respuesta= str_replace("dÃ­as","días",$respuesta);
echo str_replace;?>