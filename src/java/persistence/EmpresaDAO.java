/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Contato;
import model.Empresa;


public class EmpresaDAO {
    private static EmpresaDAO instance = new EmpresaDAO();
    private EmpresaDAO(){}
    public static EmpresaDAO getInstance(){
        return instance;
    }
    
    public void save(Empresa empresa)throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        try {
                conn = DatabaseLocator.getInstance().getConnection();
                st = conn.createStatement();
                st.execute("insert into emprese (email)" +
                        " values ('" + empresa.getNome() + "')");
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
}
