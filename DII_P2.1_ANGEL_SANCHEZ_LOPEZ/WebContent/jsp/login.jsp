<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./meta.jsp"%>
<title>Practica 2.1 DII 2 Curso</title>
</head>
<body>

	<%@include file="./header.jsp"%>

	<div id='main'>

		<%@include file="./nav.jsp"%>

		<div class="panel">
			<div class="caja">

				<div class="contenedor">
					<div class="separador"></div>
					<div class="titulo">LOGIN</div>
					<div class="login-item">
						<form action="<%=request.getContextPath()%>/registro"
							method="post" class="form form-login">
							<div class="form-field">

								<label class="user" for="login-username"></label> <input
									name="nombre" id="login-username" type="text"
									class="form-input" placeholder="Usuario" required>
							</div>

							<div class="form-field">
								<label class="lock" for="login-password"></label> <input
									name="pass" id="login-password" type="password"
									class="form-input" placeholder="Contraseña" required>
							</div>

							<div class="form-field">
								<input type="submit" name="boton" value="Acceder">
							</div>
						</form>
					</div>
					<div class="separador"></div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="./pie.jsp"%>

</body>
</html>