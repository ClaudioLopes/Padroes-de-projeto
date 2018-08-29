package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
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
    
    public void Delete(String nome)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            st.execute("delete from contato where nome = '" + nome + "'");
        }catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
    }
    
    public Contato Find(String nome)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        Contato contato = new Contato();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT nome, email FROM contato WHERE nome = '" + nome + "'");
            while(rs.next()){
                contato.setEmail(rs.getString("email"));
                contato.setNome(rs.getString("nome"));
            }
        }catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return contato;
    }
}
