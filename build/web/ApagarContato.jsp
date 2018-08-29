<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h1>Apagar Contatos</h1>
    <form action="FrontController?action=ApagarContato" method="post">
      Entre com o nome
      <input type="text" name="textNome"/><br/>
      <input type="submit"/>
    </form>
    </body>
</html>
