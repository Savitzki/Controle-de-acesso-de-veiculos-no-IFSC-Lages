package model.bo;


public class Controle {
    private String hora_entrada;    
    private String hora_saida;    
    private String data;    
    private String local;
    
    public Controle() {
    }

    public Controle(String hora_entrada, String hora_saida, String data, String local) {
        this.hora_entrada = hora_entrada;
        this.hora_saida = hora_saida;
        this.data = data;
        this.local = local;
    }

    public String getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(String hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Controle{" + "hora_entrada=" + hora_entrada + ", hora_saida=" + hora_saida + ", data=" + data + ", local=" + local + '}';
    }

    
}
