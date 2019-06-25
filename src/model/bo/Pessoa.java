package model.bo;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private int ID;    
    private String nome;  
    private String email;
    private String endereco;   
    private String bairro;
    private String sexo;    
    private String fone1;
    private String fone2;    
    private String cpf;    
    private String rg;    
    private String complemento;

    public Pessoa() {
    }

    public Pessoa(int ID, String nome, String email, String endereco, String bairro, String sexo, String fone1, String fone2, String cpf, String rg, String complemento) {
        this.ID = ID;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.bairro = bairro;
        this.sexo = sexo;
        this.fone1 = fone1;
        this.fone2 = fone2;
        this.cpf = cpf;
        this.rg = rg;
        this.complemento = complemento;
    }    
   
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getFone() {
        return fone1;
    }
    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }
    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }
    public String getFone2() {
        return fone2;
    }       
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getRg() {
        return rg;
    }    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
     
    
}
