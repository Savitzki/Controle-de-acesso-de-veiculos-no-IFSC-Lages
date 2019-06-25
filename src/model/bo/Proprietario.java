package model.bo;

import java.io.Serializable;

public class Proprietario extends Pessoa implements Serializable{
    int ID;
    String cnh;
    String tipo;
           

    public Proprietario() {
    }

    public Proprietario(int ID, String cnh) {
        this.ID = ID;
        this.cnh = cnh;
    }
    
    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
}
