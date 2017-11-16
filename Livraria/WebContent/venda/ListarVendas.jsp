<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista das vendas</title>
</head>
<body>

	<center>
 <c:choose>  
 <c:when test="${vendas.size()>0}">
	<table >
	
		<tr>
			<th>Cliente</th>
			<th>CPF</th>
			<th>E-Mail</th>
			<th>Livro</th>
			<th>Preço</th>
			<th>Opçao</th>
		</tr>
		
		<c:forEach var="v" items="${vendas}">
			<tr>
				<td>${v.cliente["nome"]}</td>
				<td>${v.cliente["cpf"]}</td>
				<td>${v.cliente["email"]}</td>
				<td>${v.cliente["sexo"]}</td>
				<td>${v.livro["nome"]}</td>
				
				<c:choose>
				<c:when test="${empty v.descricao}">
				<td>Descrição não informada</td>
				</c:when>
				<c:otherwise>
				<td>${v.descricao}</td>
				</c:otherwise>
				</c:choose>
				
				<td><input type="button" onclick="location='/Livraria/venda?acao=DELETE&id=${v.idVenda}'" value="DELETE"/></td>
				
			</tr>
		</c:forEach>
	</table>
	<p><input type="button" onclick="location='/Livraria/venda?acao=Vender'" value="Cadastar nova venda"><br/>
<c:import url="menu.jsp" /> 
	
	</c:when>
	<c:otherwise>
	<h1>Não existe venda cadastrada</h1>
	<p><input type="button" onclick="location='/Livraria/venda?acao=Vender'" value="Realizar nova venda"></a><br/>
	<c:import url="menu.jsp" /> 
	</c:otherwise>
</c:choose>
</center>
</body>
</html>