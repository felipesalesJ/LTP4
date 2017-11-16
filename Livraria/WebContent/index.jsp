<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
	<form action="../Livraria/login" method="post" >
					<input type="hidden" name="acao" value="logar"/>
					<p><td> Usuario: <input type="text" name="user" /></td>
					<p><td> Senha: <input type="password" name="pass" /></td>
					<p><input type="submit" value="login" />	
				</font>	
	</form>
</body>
</html>