package model.DAO.ser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DAO.InterfaceDAO;
import model.bo.Proprietario;

public class ProprietarioDAOSerializa implements InterfaceDAO<Proprietario>{
    
    public static final String fileSerializacao = "C:\\Users\\mahsa\\Documents\\NetBeansProjects\\Controle_acesso_IFSC-v12\\serializa\\serializacaoProprietario.ser";

    @Override
    public void Create(Proprietario objeto) {
        
        Serializa serializaProp = new Serializa();
        List<Proprietario> listaPropSerializa = new ArrayList<>();
        
        try {
            listaPropSerializa = serializaProp.DeSerializa(fileSerializacao);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        listaPropSerializa.add(objeto);
        
        try {
            serializaProp.Serializa(fileSerializacao, (ArrayList) listaPropSerializa);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public List<Proprietario> Retrive() {
        Serializa serializaProp = new Serializa();
        List<Proprietario> listaPropSerializa = new ArrayList<>();
        
        try {
            listaPropSerializa = serializaProp.DeSerializa(fileSerializacao);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProprietarioDAOSerializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return listaPropSerializa;
        
    }
    

    @Override
    public Proprietario Retrive(int id) {
        Serializa serializaProp = new Serializa();
        List<Proprietario> listaPropSerializa = new ArrayList<>();
        
        try {
            listaPropSerializa = serializaProp.DeSerializa(fileSerializacao);
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(ProprietarioDAOSerializa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        int indiceProp = listaPropSerializa.indexOf(id);
        if(indiceProp!=-1){
            return listaPropSerializa.get(indiceProp);
        }else
            return null;
    }

    @Override
    public void Update(int id, Proprietario objeto) {
        Serializa serializaProp = new Serializa();
        List<Proprietario> listaPropSerializa = new ArrayList<>();
    }

    @Override
    public void Delete(int id) {
        Serializa serializaProp = new Serializa();
        List<Proprietario> listaPropSerializa = new ArrayList<>();
    }
    
}
