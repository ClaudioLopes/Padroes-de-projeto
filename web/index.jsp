<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

    <h1>Cadastro de Contatos</h1>
    <form action="FrontController?action=GravarContato" method="post">
      Entre com seu nome
      <input type="text" name="textNome"/><br/>
      Entre com seu email
      <input type="text" name="textEmail"/><br/>
      <input type="submit"/>
    </form>
    </body>
</html>
