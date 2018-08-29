<%-- 
    Document   : GravarEmpresa
    Created on : Aug 28, 2018, 9:30:26 PM
    Author     : claudio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro de Empresa</h1>
        <form action="FrontController?action=GravarEmpresa" method="post">
          Entre com o codigo da empresa
          <input type="text" name="textCodigo"/><br/>
          Entre com o nome da empresa
          <input type="text" name="textNome"/><br/>
          <input type="submit"/>
        </form>
    </body>
</html>
