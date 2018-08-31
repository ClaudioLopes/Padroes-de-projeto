/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistence;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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
                st.execute("insert into empresa (codigo, nome)" +
                        " values (" + empresa.getCodigo() + ", '" + empresa.getNome()+ "')");
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
    
    public List<Empresa> Find() throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        List<Empresa> empresas = new ArrayList<Empresa>();
        try{
            conn = DatabaseLocator.getInstance().getConnection();
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM empresa");
            while(rs.next()){
                Empresa empresa = new Empresa();
                empresa.setCodigo(rs.getInt("codigo"));
                empresa.setNome(rs.getString("nome"));
                empresas.add(empresa);
            }
        }catch(SQLException e) {
                throw e;
            } finally {
                closeResources(conn, st);
            }
        return empresas;
    }
}
