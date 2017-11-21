<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Menu</title>
</head>
<body>
<table>
<th>
	<h2>Livro</h2>
	<p><a href="/Livraria/livro/cadastrarLivro.jsp">Cadastro de livro</a><br/>
	<p><a href="/Livraria/livro?acao=ReadALL"> Lista de livros</a>
	</th>
<th>
	<h2 >Cliente</h2>
	<p><a	href="/Livraria/cliente/cadastrarCliente.jsp">Cadastro de clientes</a><br/>
	<p><a href="/Livraria/cliente?acao=ReadALL">Lista de clientes</a>
	</th>
<th>
	<h2 >Venda</h2>
	<p><a href="/Livraria/venda?acao=VENDER">Vender livro</a><br/>
	<p><a href="/Livraria/venda?acao=ReadALL"> Exibir todas as vendas de livros</a>
	</th>
</table>

	<p><input type="button" onclick="location='/Livraria/login'" value="Sair"><br/>
	</p>
	


</body>
</html>