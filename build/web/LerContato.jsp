<%-- 
    Document   : LerContato
    Created on : Aug 28, 2018, 9:21:26 PM
    Author     : claudio
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ler Contatos</h1>
        <form action="FrontController?action=LerContato" method="post">
          Entre com o nome
          <input type="text" name="textNome"/><br/>
          <input type="submit"/>
        </form>
    </body>
</html>
