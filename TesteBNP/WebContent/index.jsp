<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Movimentos Manuais</h1>
	<form action="MovimentoManualServlet" method="post">
		<table>
			<tr>
				<td><label for="mes">M�s:</label> <input name="mes"
					placeholder="Text" type="text" /></td>
				<td><label for="ano">Ano:</label> <input name="ano"
					placeholder="Text" type="text" /></td>
			</tr>

			<tr>
				<td><label for="produto">Produto:</label> <select>
				</select></td>
				<td><label for="COSIF">COSIF:</label> <select>
				</select></td>
			</tr>
			<tr>
				<td><label for="valor">Valor:</label>
				<input type="text" name="valor">
			</tr>
			<tr>
				<td><label for="descricao">Descri��o:</label>
				<input type="text" name="descricao" >
			</tr>
		</table>
		<input type="submit" value="Limpar" id="button-1"/>
		<input type="submit" value="Novo" id="button-2"/>
		<input type="submit" value="Incluir" id="button-3"/>
		
	</form>
	
	<table id="table-1">
		<thead>
			<tr>
				<th>M�s</th>
				<th>Ano</th>
				<th>C�digo do Produto</th>
				<th>Descri��o do Produto</th>
				<th>NR Lan�amento</th>
				<th>Descri��o</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>M�s</th>
				<th>Ano</th>
				<th>C�digo do Produto</th>
				<th>Descri��o do Produto</th>
				<th>NR Lan�amento</th>
				<th>Descri��o</th>
				<th>Valor</th>
			</tr>
		</tbody>
	</table>
</body>
</html>