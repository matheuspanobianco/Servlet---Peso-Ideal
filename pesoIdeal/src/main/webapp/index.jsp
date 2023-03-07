<%--@elvariable id="pesoIdeal" type="java"--%>
<html>
<head>
    <title>Peso Ideal</title>
</head>
<body>
<h1>Calculo do Peso Ideal</h1>
<form name="pesoIdeal" action="calc" method="GET">
    <table>
        <tr>
            <td><label for="gender">Seu genero ("H" ou "M"):</label></td>
            <td><input type="text" name="genero" id="gender"/></td>
        </tr>
        <tr>
            <td><label for="height">Sua altura (metros) :</label></td>
            <td><input type="text" name="altura" id="height"/></td>
        </tr>
        <tr>
            <th><input type="submit" value="Enviar" name="find"/></th>
            <th><input type="reset" value="Limpar" name="reset"/></th>
        </tr>
    </table>
    <h2>Peso ideal: ${pesoIdeal}</h2>
</form>
</body>
</html>