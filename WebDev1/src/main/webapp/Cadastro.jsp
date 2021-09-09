<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>*Dados Pessoais* </title>
</head>
<body>
	**Preencha os dados pessoais**: 
	<form action="ServletTela1Cadastro">
		Nome: <input type="text" name="nome"><br><br>
		Sobrenome: <input type="text" name="sobrenome"><br><br>
		**Endereço residencial**: <br><br>
		Rua: <input type="text" name="rua"><br><br>
		Cidade: <input type="text" name="cidade"><br><br>
		Estado: <input type="text" name="estado"><br><br>
		CEP: <input type="text" name="cep"><br><br>
		Complemento: <input type="text" name="complemento"><br><br>
		<input type="submit" value="Próxima tela"><br><br>
	</form>
</body>
</html>