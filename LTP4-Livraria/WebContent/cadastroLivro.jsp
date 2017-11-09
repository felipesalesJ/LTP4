<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>

	
	<center>
	<h1></h1>
	
	<form action="/LPT4-Livraria/livro" method="post">
		<input type="hidden" name="acao" value="CREATE" />
		Nome: <input type="text" name="nome" required="required"></br>
		<p>Preço: <input type="number" name="preco" required="required"></br>
		<p>isnb: <input type="text" name="isnb" required="required"></br>
		<p>Autor: <input type="text" name="autor" required="required"></br>
		<p><input type="submit" value="create">

	</form>	
	</center>
</body>
</html>