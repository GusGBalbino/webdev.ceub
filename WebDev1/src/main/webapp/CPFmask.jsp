<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercício 18 Nov</title>
</head>
<script type="text/javascript">
function additem(){
	var campotxt = document.getElementById("item");	
	var campoitens = document.getElementById("objetos");
	
	var newopt = document.createElement("opt");
	
	newopt.text = campotxt.value;
	
	campoitens.add(newopt);
}

function addtxt(){
	var campoatxt = document.getElementById("atxt");
	var campoitens = document.getElementById("itens");
	
	var position = campoitens.selectedIndex;
	
	var newtxt = campoitens[posicaoselec].text;
	
	campoatxt.value = campoatxt.value + "\n" + newtxt;
}

function inserirreg(){
	var nome = document.getElementById("nome").value;
	var cpf = document.getElementById("cpf").value;
	
	var table = document.getElemenById("reg");
	
	var ltot = table.rows.length;
	
	var newl = table.insertRow(ltot);
	
	var newcelnome = newl.insertCell(0);
	var newcelcpf = newl.insertCell(1);
	
	newcelnome.innerHTML = nome;
	newcelcpf.innerHTML = cpf;
}

function mascaracpf(){
	var cpf = document.getElementById('cpf');
	if (cpf.value.legth == 3 || cpf.value.length == 7){
		cpf.value += "."
	}
	else if (cpf.value.legth == 11){
		cpf.value += "."
	}
		
}
</script>
<body>
<h3>MANIPULANDO OBJETOS</h3>
<form>
	<input id="item" type="text">Digite o item a ser inserido:</input><br>
	<input type="button" value="ADD" onclick="additem()"></input><br>
	<select name="objetos" onchange="addtxt()">
	</select>
	<br>
	<textarea id="atxt" rows="20" cols="30"></textarea>
</form>
Nome:<input id="nome" type="text"></input>
CPF:<input id="cpf" type="text" pattern="[0-9]{1}.[0-9]{3}.[0-9]{3}" >CPF:</input><br><br>
<input type="button" value="Registrar" onclick="inserirreg()"></input><br>
<table id="reg" border="2">
	<tr>
		<th>Nome</th>
		<th>CPF</th>
	</tr>
	<tr>
		<td>Joaquim</td>
		<td>412.141.233-01</td>
	</tr>
</table>
</body>
</html>