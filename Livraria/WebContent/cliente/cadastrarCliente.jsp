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
	<h1></h1>
	<form action="/Livraria/cliente" method="post">
		<input type="hidden" name="acao" value="CREATE" />
		Nome: <input type="text" name="nome" required="required"></br>
		<p>Email: <input type="text" name="email" required="required"></br>
		<p>CPF: <input type="text" name="cpf" required="required"></br>
		<p><input type="submit" value="CREATE">
	</form>	
</body>
</html>