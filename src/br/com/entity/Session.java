package br.com.entity;

public class Session {
    private int sId_usuario;
    private String sUsuario;
    private String sSenha;
    private String sEmail;
    private int sTelefone;
    private Double sSaldo;
    private int sNumero_conta;
    private String sData_criacao;

    public String getsData_criacao() {
        return sData_criacao;
    }

    public void setsData_criacao(String sData_criacao) {
        this.sData_criacao = sData_criacao;
    }

    public int getsTelefone() {
        return sTelefone;
    }

    public void setsTelefone(int sTelefone) {
        this.sTelefone = sTelefone;
    }

    public Double getsSaldo() {
        return sSaldo;
    }

    public void setsSaldo(Double sSaldo) {
        this.sSaldo = sSaldo;
    }

    public int getsNumero_conta() {
        return sNumero_conta;
    }

    public void setsNumero_conta(int sNumero_conta) {
        this.sNumero_conta = sNumero_conta;
    }

    public int getsId_usuario() {
        return sId_usuario;
    }

    public void setsId_usuario(int sId_usuario) {
        this.sId_usuario = sId_usuario;
    }

    public String getsUsuario() {
        return sUsuario;
    }

    public void setsUsuario(String sUsuario) {
        this.sUsuario = sUsuario;
    }

    public String getsSenha() {
        return sSenha;
    }

    public void setsSenha(String sSenha) {
        this.sSenha = sSenha;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    private static Session instance;

    public Session() {}

    public static Session getInstance() {
        if (instance == null)
            instance = new Session();
        return instance;
    }

}
