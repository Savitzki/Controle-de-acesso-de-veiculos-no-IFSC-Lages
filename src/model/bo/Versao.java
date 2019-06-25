package model.bo;

import java.io.Serializable;

public class Versao implements Serializable{
        
        private int ID;        
    	private String consumo;
	private String potencia;
	private int numero_de_portas;
	private int numero_de_assentos;
	private String cambio;
	private String nome_versao;        
        private Marca modelo;
        

    public Versao() {
    }

    public Versao(int ID, String consumo, String potencia, int numero_de_portas, int numero_de_assentos, String cambio, String nome_versao, Marca modelo) {
        this.ID = ID;
        this.consumo = consumo;
        this.potencia = potencia;
        this.numero_de_portas = numero_de_portas;
        this.numero_de_assentos = numero_de_assentos;
        this.cambio = cambio;
        this.nome_versao = nome_versao;
        this.modelo = modelo;
    }    
    

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public String getNome_versao() {
        return nome_versao;
    }

    public void setNome_versao(String nome_versao) {
        this.nome_versao = nome_versao;
    }

    public int getNumero_de_assentos() {
        return numero_de_assentos;
    }

    public void setNumero_de_assentos(int numero_de_assentos) {
        this.numero_de_assentos = numero_de_assentos;
    }

    public int getNumero_de_portas() {
        return numero_de_portas;
    }

    public void setNumero_de_portas(int numero_de_portas) {
        this.numero_de_portas = numero_de_portas;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Marca getModelo() {
        return modelo;
    }

    public void setModelo(Marca modelo) {
        this.modelo = modelo;
    }

    
    @Override
    public String toString() {
        return "Versao{" + "ID=" + ID + ", consumo=" + consumo + ", potencia=" + potencia + ", numero_de_portas=" + numero_de_portas + ", numero_de_assentos=" + numero_de_assentos + ", cambio=" + cambio + ", nome_versao=" + nome_versao + ", modelo=" + modelo + '}';
    }

        
    
}
