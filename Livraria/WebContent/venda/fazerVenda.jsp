<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Realizar venda!!!</title>
</head>
<body>

	<c:choose>	
	<c:when test="${clientes.size()<1 and livros.size()>0}">
	
	<h1> Não exite nenhum cliente cadastrado!</h1>
	<P><input type="button" onclick="location='/Livraria/cliente/cadastrarCliente.jsp'" value="Cadastar novo cliente"><br/>
	</c:when>

	<c:when test="${clientes.size()>0 and livros.size()<1}">
	
	<h1>Nenhum livro cadastrado no sistema!</h1>
	<P><input type="button" onclick="location='/Livraria/livro/cadastrarLivro.jsp'" value="Cadastar novo livro"><br/>
	</c:when>	
	
	
	<c:when test="${clientes.size()<1 and livros.size()<1}">	
	
		<h1>Não temos nenhum produto ou livro cadastrados no sistema!</h1>
		<P><input type="button" onclick="location='/Livraria/cliente/cadastrarCliente.jsp'" value="Cadastar cliente"><br/>
		<P><input type="button" onclick="location='/Livraria/livro/cadastrarLivro.jsp'" value="Cadastar livro"><br/>
	</c:when>


	<c:otherwise>
			<h3><c:out value=" ${usuario} escolha para quem vender, qual livro vender e uma breve descrição da venda!"/></h3><br/>
	
		<p><form action="/Livraria/venda" method="post">
			<p>	<a> Escolhar um cliente</a>	</p>
			<input  type="hidden"  name="acao" value="createVenda"/>
			<p>	<select name="idCliente">
					<c:forEach var="cli" items="${clientes}">
						<option value="${cli.id}">
							<c:out value="${cli.nome}" />
						</option>
					</c:forEach>
				</select>
			</p>
			
			<p>	<a> Escolha um livro</a><p>
				<select name="idLivro">
					<c:forEach var="l" items="${livros}">
						<option value="${l.id}">
							<c:out value="${l.nome}" />
						</option>
					</c:forEach>
				</select>
			
			<p>	<input type="submit" value="Vender">
			<input type="reset" value="Limpar">
		</form>
		<input type="button" onclick="location='/Livraria/venda?acao=Listar'" value=" Lista das vendas"><br/>
		
</c:otherwise>
</c:choose>
</body>
</html>