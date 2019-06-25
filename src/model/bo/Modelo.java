package model.bo;

import java.io.Serializable;

public class Modelo implements Serializable{
    
        private int ID;   
	private String nome_modelo;
	private String categoria;
	private String tipo;
        private Marca marca;
        

    public Modelo() {
    }

    public Modelo(int ID, String nome_modelo, String categoria, String tipo, Marca marca) {
        this.ID = ID;
        this.nome_modelo = nome_modelo;
        this.categoria = categoria;
        this.tipo = tipo;
        this.marca = marca;
    }
   
    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome_modelo() {
        return nome_modelo;
    }

    public void setNome_modelo(String nome_modelo) {
        this.nome_modelo = nome_modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Modelo{" + "ID=" + ID + ", nome_modelo=" + nome_modelo + ", categoria=" + categoria + ", tipo=" + tipo + ", marca=" + marca + '}';
    }
    
}
