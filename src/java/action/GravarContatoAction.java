package action;

import controller.Action;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contato;
import persistence.ContatoDAO;
import persistence.EmpresaDAO;

/**
 *
 * @author claudio
 */
public class GravarContatoAction implements Action{
    public GravarContatoAction(){
        
    }

    public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String nome = request.getParameter("textNome");
        String email = request.getParameter("textEmail");
        String codigo = request.getParameter("textEmpresa");
        int id = Integer.parseInt(codigo);
        
        if(nome.equals("") || email.equals("")) {
           response.sendRedirect("index.jsp");
        } else {
            Contato contato = new Contato(nome, email, id);
            try{
                ContatoDAO.getInstance().save(contato);
                response.sendRedirect("contatoSucesso.jsp");
            }catch(SQLException ex){
                response.sendRedirect("contatoErro.jsp");
                ex.printStackTrace();
            }catch(ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }
}
