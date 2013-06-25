<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page session="false" %>
<html>
<head>
<title>Calcula Penas - por Víctor Casas San Miguel usando Struts 2 con Google App Engine</title>
<link rel="stylesheet" type="text/css" media="all" href="estilos.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js" type="text/javascript" charset="utf-8"></script>
</head>
<body>
<div id="pagewidth" >
	<div id="headerbar">
		<div id="headercol">
			<div id="logo">
				<h3><a href="Inicio.action">Cálculo legal de las penas</a></h3>
			</div>
		<div id="headerlink">
			<a href="/Login">Login</a>
			<span class="sep">|</span>
			<a href="/About">Más info</a>
			<span class="sep">|</span>
			<a href="/">Herramientas</a>
		</div>
	</div>
</div>
<div id="header">
	<div id="headercol">
	</div>
</div>
<div id="wrapper" class="clearfix">
	<div id="maincol">
	    <center>
<div id="form">	
 <s:form action="Calculadora" method="get">
<s:select label="Seleccione años" 
		headerKey="0" headerValue="Seleccione años"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="a" 
		value="0" />
<s:select label="Seleccione meses" 
		headerKey="0" headerValue="Seleccione meses"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="m" 
		value="0" />
<s:select label="Seleccione días" 
		headerKey="0" headerValue="Seleccione días"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="d" 
		value="0" />
<s:select label="Seleccione años" 
		headerKey="0" headerValue="Seleccione años"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="a0" 
		value="0" />
<s:select label="Seleccione meses" 
		headerKey="0" headerValue="Seleccione meses"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="m0" 
		value="0" />
<s:select label="Seleccione días" 
		headerKey="0" headerValue="Seleccione días"
		list="{'0','1','2','4','5','6','7','8','9','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30'}" 
		name="d0" 
		value="0" />
            <s:submit value="Calcular"/>
</s:form>
</div>


    
</center>					</div>

			</div>
			<div id="footer">
				<p> Copyright &copy; 2013
 <a href="mailto:victor.casas.sm@gmail.com">victor.casas.sm@gmail.com</a></p> 

			</div>
		</div>

    </body>
</html>
