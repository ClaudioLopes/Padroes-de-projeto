/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import model.Empresa;
import persistence.ContatoDAO;
import persistence.EmpresaDAO;

/**
 *
 * @author claudio
 */
public class GravarEmpresaAction implements Action{
    public GravarEmpresaAction(){
        
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("textNome");
        
        if(nome.equals("")) {
           response.sendRedirect("index.jsp");
        } else {
            Empresa empresa = new Empresa(nome);
            try{
                EmpresaDAO.getInstance().save(empresa);
                response.sendRedirect("empreseSucesso.jsp");
            }catch(SQLException ex){
                response.sendRedirect("empreseErro.jsp");
                ex.printStackTrace();
            }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }
}

