package model.DAO.ser;

import java.util.ArrayList;
import java.util.List;
import model.DAO.InterfaceDAO;
import model.bo.Automovel;

public class AutomovelDAOSerializa implements InterfaceDAO<Automovel>{

    public static final String fileSerializacao = "C:\\Users\\mahsa\\Documents\\NetBeansProjects\\Controle_acesso_IFSC-v12\\serializa\\serializacaoAutomovel.ser";
    
    @Override
    public void Create(Automovel objeto) {
        Serializa serializa = new Serializa<Automovel>();
        List<Automovel> listaAutomovelser = new ArrayList<>();
        
        try {
            listaAutomovelser = serializa.DeSerializa(fileSerializacao);
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        listaAutomovelser.add(objeto);
        
        try {
            serializa.Serializa(fileSerializacao, (ArrayList)listaAutomovelser);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public List<Automovel> Retrive() {
        Serializa serializa = new Serializa<Automovel>();
        List<Automovel> listaAutomovelser = new ArrayList<Automovel>();
        
        try {
            listaAutomovelser = serializa.DeSerializa(fileSerializacao);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return listaAutomovelser;
        
    }

    @Override
    public Automovel Retrive(int id) {
        Serializa serializaAutomovel = new Serializa<Automovel>();
        List<Automovel> listaAutomovelser = new ArrayList<>();
        
        try {
            listaAutomovelser = serializaAutomovel.DeSerializa(fileSerializacao);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int indiceAutomovel = listaAutomovelser.indexOf(id);
        if(indiceAutomovel!= -1){
            return (Automovel) listaAutomovelser;
        } else{
            return null;
        }
       
    }

    @Override
    public void Update(int id, Automovel objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
