/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author claudio
 */
public class Empresa {
    private int codigo;
    private String nome;

    public Empresa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public Empresa(){
        
    }

    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
