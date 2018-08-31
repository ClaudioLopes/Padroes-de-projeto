<%-- 
    Document   : GravarContato
    Created on : Aug 28, 2018, 9:31:38 PM
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
        <h1>Cadastro de Contatos</h1>
        <form action="FrontController?action=GravarContato" method="post">
          Entre com seu nome
          <input type="text" name="textNome"/><br/>
          Entre com seu email
          <input type="text" name="textEmail"/><br/>
          Selecione a empresa
          <select name="textEmpresa" class="frmCmb1">
              <option value="empresas">Empresas</option>
              <c:forEach var="empresa" items="${empresa}">
                <option value="${empresa.codigo}">
              </option>
             </c:forEach>
          </select><br/>
          <input type="submit"/>
        </form>
    </body>
</html>
