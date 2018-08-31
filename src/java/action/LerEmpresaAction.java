/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistence.EmpresaDAO;

/**
 *
 * @author claudio
 */
public class LerEmpresaAction {
    
    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException, ClassNotFoundException {
            try{
                request.setAttribute("empresa", EmpresaDAO.getInstance().Find());
                RequestDispatcher view = request.getRequestDispatcher("/GravarContato.jsp");
                view.forward(request, response);
            } catch (ServletException ex) {
                ex.printStackTrace();
            }
    }
}
