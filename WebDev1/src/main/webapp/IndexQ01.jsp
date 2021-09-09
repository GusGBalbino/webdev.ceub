<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Saudações!</title>
</head>
<body>
Digite seu nome e sobrenome abaixo, por favor:
<form action="ServletSaudacao">
    <input type="text" name="nome" /><br>
    <input type="text" name="sobrenome" />
    <input type="submit" name="Enviar" />
</form>
</body>
</html>