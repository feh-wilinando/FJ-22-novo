<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action='/estoque/filme' method="post">
	 	<div>
			<label for="nome">Nome:</label>
			<input type="text" name="nome">
	 	</div>

	 	<div>
			<label for="genero">Genero:</label>
			<input type="text" name="genero">
	 	</div>

	 	<div>
			<label for="duracao">Duracao:</label>
			<input type="text" name="duracao">
	 	</div>

	 	<button type="submit" class="button">Gravar</button>
	</form>
</body>
</html>