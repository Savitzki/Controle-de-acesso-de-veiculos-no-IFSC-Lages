package model.DAO.ser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.DAO.InterfaceDAO;
import model.bo.Versao;

public class VersaoDAOSerializa implements InterfaceDAO<Versao>{
    
    private final String fileSerializaVer =  "C:\\Users\\mahsa\\Documents\\NetBeansProjects\\Controle_acesso_IFSC-v12\\serializa\\serializaVersao.ser";

    @Override
    public void Create(Versao objeto) {
        Serializa serializaVersao = new Serializa<Versao>();
        List<Versao> listaSerializaVer =  new ArrayList<>();
        
        try {
            listaSerializaVer =  serializaVersao.DeSerializa(fileSerializaVer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        listaSerializaVer.add(objeto);
        
            try {
                serializaVersao.Serializa(fileSerializaVer, (ArrayList) listaSerializaVer);
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
    }

    @Override
    public List<Versao> Retrive() {
        Serializa serializaVersao = new Serializa<Versao>();
        List<Versao> listaSerializaVer =  new ArrayList<>();
        
        try {
            listaSerializaVer =  serializaVersao.DeSerializa(fileSerializaVer);
        } catch (Exception ex) {
        }
        return listaSerializaVer;
    }

    @Override
    public Versao Retrive(int id) {
        Serializa serializaVersao = new Serializa<Versao>();
        List<Versao> listaSerializaVer =  new ArrayList<>();
        
        try {
            listaSerializaVer =  serializaVersao.DeSerializa(fileSerializaVer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        int indiceVersao = listaSerializaVer.indexOf(id);
        if(indiceVersao!=-1){
            return (Versao) listaSerializaVer;
        }else{
            return null;
        }
    }

    @Override
    public void Update(int id, Versao objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
