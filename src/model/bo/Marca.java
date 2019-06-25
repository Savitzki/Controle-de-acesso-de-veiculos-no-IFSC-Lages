package model.bo;

import java.io.Serializable;

public class Marca implements Serializable{
    
    private int ID;   
    private String descricao;   
    private Marca marca;

    public Marca() {
    }

    public Marca(int ID, String descricao) {
        this.ID = ID;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Marca{" + "ID=" + ID + ", descricao=" + descricao + ", marca=" + marca + '}';
    }

    
}
