package model.bo;

import java.io.Serializable;

public class Automovel implements Serializable{
    
        private int ID;
        private String placa;
	private String ano;

    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }  
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public Automovel() {
    }
    public Automovel(String placa, String ano) {
        this.placa = placa;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Automovel{" + "ID=" + ID + ", placa=" + placa + ", ano=" + ano + '}';
    }
           
    
}
