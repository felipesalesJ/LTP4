<%@page import="br.com.livraria.bo.LivroBo"%>
<%@page import="br.com.livraria.modelo.Livro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${Lista.size()>0}">
	<h1> </h1>
	<table >
		<tr>
			<th>Nome</th>
			<th>Preço</th>
			<th>isnb</th>
			<th>Autor</th>
			<th>Opções</th>
		</tr>
	

	<c:forEach var="l" items="${Lista}">
	<tr>
		<td>${l.nome}</td>
		<td><fmt:formatNumber value="${l.preco}" type="currency"/></td>
		<td>${l.isnb}</td>
		<td>${l.autor}</td>
		<td>${l.autor}</td>
		<td>${l.autor}</td>
		
		<td>
		<input type="button" onclick="location='/Livraria/livro?acao=SEARCH&id=${l.id}'" value="UPDATE">
		<input type="button" onclick="location='/Livraria/livro?acao=DELETE&id=${l.id}'" value="DELETE">
		
	</tr>
	
	</c:forEach>
	</table>
	<p><input type="button" onclick="location='/Livraria/livro/cadastrarLivro.jsp'" ><br/> 
	 </c:when>
	</c:choose>
</body>
</html>