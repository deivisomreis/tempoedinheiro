<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		<link href='https://fonts.googleapis.com/css?family=Poiret+One' rel='stylesheet' type='text/css'>
		
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Tempo & Dinheiro</title>
	</head>
	<body>
		<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="/home">Tempo & Dinheiro</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="/home">Inicio</a></li>
				<li><a href="/sobre">Projeto</a></li>
				<li><a href="/usuariologin">Usuario</a></li>
				<li class="active"><a href="/adminlogin">Admin</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li id="id_button"><a href="#"><span class="glyphicon glyphicon-log-in"></span>Login</a></li>
			</ul>
		</div>
		</nav>
		<div class="container">
			<div class="jumbotron">
				<h1 align="center">Tempo & Dinheiro</h1>
				<p align="center">Administrador</p>
				<p align="center">Nesta �rea ser� poss�vel gerenciar usu�rios como tamb�m tarefas / finan�as</p>
			</div>
			
			<div id="form_login" style="display: none;">
			<form role="form" action="/adminlogin" method="post">
				<div class="form-group">
					<label for="email">Usu�rio:</label> <input type="email" name="usuario"
						class="form-control" id="email" placeholder="E-mail">
				</div>
				<div class="form-group">
					<label for="pwd">Senha:</label> <input type="password" name="senha" required="true"
						class="form-control" id="pwd">
				</div>
				<div class="checkbox">
					<label><input type="checkbox"> Remember me</label>
				</div>
				<button type="reset" class="btn btn-default">Limpar</button>
				<button type="submit" class="btn btn-default">Logar</button>
			</form>
		</div>
	</div>
</body>
</html>
<script>
$("#id_button").click(function(){
	$(".jumbotron").hide(500);
	$("#form_login").slideToggle(500);
});
</script>

<style>*{font-family: Poiret One, cursive;}</style>