package model;

public class Contato {
    private String nome;
    private String email;
    private int codigoEmpresa;

    public Contato(String nome, String email, int codigoEmpresa) {
        this.nome = nome;
        this.email = email;
        this.codigoEmpresa = codigoEmpresa;
    }

    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }

    public Contato() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
