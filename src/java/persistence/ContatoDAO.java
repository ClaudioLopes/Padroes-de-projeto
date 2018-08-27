package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Contato;

public class ContatoDAO {
    private static ContatoDAO instance = new ContatoDAO();
    private ContatoDAO(){}
    public static ContatoDAO getInstance(){
        return instance;
    }
    
    public void save(Contato contato)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConnection();
                st = conn.createStatement();
                st.execute("insert into contato (nome, email)" +
                        " values ('" + contato.getNome() + "', '" + contato.getEmail() + "')");
            } catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }

    public void closeResources(Connection conn, Statement st){
        try{
            if(st != null) st.close();
            if(conn != null) conn.close();
        }catch(SQLException e){
            
        }
        
    }
    
    public void Delete(Contato contato)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from contato were nome = '" + contato.getNome() + "';");
        }catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }
    
    public void Find(Contato contato)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("SELECT email FROM contato WHERE nome = '" + contato.getNome() + "'");
        }catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }
}
