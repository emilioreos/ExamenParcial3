<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<script type="text/javascript">
		function validar() {
			var x = document.forms["calculadora"]["x"].value;
			var y = document.forms["calculadora"]["y"].value;
			if (!x) {
				alert("x esta Vacio");
				return false;
			} else if (!y) {
				alert("y esta Vacio");
				return false;
			}
		}
	</script>
	<form name="calculadora" method="post" action="Calculadora"
		onsubmit="return validar()">
		<table>
			<tr>
				<td>X</td>
				<td><input type=text name="x"></td>
			</tr>
			<tr>
				<td>Y</td>
				<td><input type=text name="y"></td>
			</tr>
			<tr>
				<td><select name="operacion">
						<%
							out.print("<option value=\"mas\">+</option>");
							out.print("<option value=\"por\">*</option>");
							out.print("<option value=\"menos\">-</option>");
							out.print("<option value=\"divicion\">/</option>");
						%>
				</select></td>
				<td><input type="submit" value="Operar" name="operar">
			</tr>
		</table>

	</form>


</body>
</html>