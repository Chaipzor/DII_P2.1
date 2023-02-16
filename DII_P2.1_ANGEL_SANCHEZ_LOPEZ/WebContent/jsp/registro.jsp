<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./meta.jsp"%>
<title>LOGIN</title>
</head>
<body>

	<%
		String texto = "";
		if (request.getAttribute("texto") != null) {
			texto = (String) request.getAttribute("texto");
		}
	%>

	<%@include file="./header.jsp"%>

	<div id='main'>

		<%@include file="./nav.jsp"%>

		<div class="panel">
			<div class="caja">

				<div class="contenedor">
					<div class="separador"></div>
					<div class="titulo">REGISTRO</div>
					<div class="subtitulo">
						<%
							out.println(texto);
						%>
					</div>
					<div class="login-item">
						<form action="<%=request.getContextPath()%>/registro"
							method="post" class="form form-login">
							<div class="form-field">

								<label for="nombre">NOMBRE</label> <input name="nombre"
									id="username" type="text" class="form-input"
									placeholder="Nombre" required>
							</div>
							<div class="form-field">

								<label for="apellidos">APELLIDOS</label> <input name="apellidos"
									id="apellidos" type="text" class="form-input"
									placeholder="Apellidos" required>
							</div>
							<div class="form-field">

								<label for="email">EMAIL</label> <input name="email" id="email"
									type="text" class="form-input" placeholder="Email" required>
							</div>
							<div class="form-field">

								<label for="telefono">TELÉFONO</label> <input name="telefono"
									maxlength="9" id="telefono" type="text" class="form-input"
									placeholder="Telefono" required>
							</div>
							<div class="form-field">

								<label for="password">CONTRASEÑA</label> <input name="pass"
									id="login-password" type="password" class="form-input"
									placeholder="Contraseña" required>
							</div>
							<div class="form-field">

								<label for="password">CONTRASEÑA</label> <input name="pass2"
									id="login-password" type="password" class="form-input"
									placeholder="Comprobación contraseña" required>
							</div>
							<div class="form-field">
								<input type="submit" name="boton" value="Registrar">
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