<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>    
 <center> 
<form action="" method="post">

		<input type="hidden" name="acao" value="Alterar" />
		<input type="hidden" name="id" value="${car.id}">
		<p>Nome: <input type="text" name="nome" value="${livro.nome}" required></br>
		<p>Pre�o: <input type="number" name="preco" value="${lvro.preco}" required></br>
		<p>Fornecedor: <input type="text" name="fornecedor" value="${livro.autor}" required></br>
		<p><input type="submit" value="Alterar">
		<input type="reset" value="Limpar">

	</form>
</center>
</body>
</html>