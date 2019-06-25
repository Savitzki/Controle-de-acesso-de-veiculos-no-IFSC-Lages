package model.DAO.ser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.DAO.InterfaceDAO;
import model.bo.Modelo;


public class ModeloDAOSerializa implements InterfaceDAO<Modelo>{   
    
    public static final String fileSerializacao = "C:\\Users\\mahsa\\Documents\\NetBeansProjects\\Controle_acesso_IFSC-v12\\serializa\\serializacaoModelo.ser";

    @Override
    public void Create(Modelo objeto) {
        Serializa serializaModelo =  new Serializa<Modelo>();
        List<Modelo> listaModeloSer = new ArrayList<>();
        
        try {
            listaModeloSer = serializaModelo.DeSerializa(fileSerializacao);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
        listaModeloSer.add(objeto);
        
        try {
            serializaModelo.Serializa(fileSerializacao, (ArrayList) listaModeloSer);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }               
    }

    @Override
    public List<Modelo> Retrive() {
         Serializa serializaModelo = new Serializa<Modelo>();
         List<Modelo> listaModeloSer =  new ArrayList<>();
         
        try {
            listaModeloSer= serializaModelo.DeSerializa(fileSerializacao);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return listaModeloSer; 
    }

    @Override
    public Modelo Retrive(int id) {
        Serializa serializaModelo = new Serializa<Modelo>();
        List<Modelo> listaMarcasSerializa =  new ArrayList<>();
         
        try {
            listaMarcasSerializa= serializaModelo.DeSerializa(fileSerializacao);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceModelo = listaMarcasSerializa.indexOf(id);
        if(indiceModelo!=-1){
            return listaMarcasSerializa.get(indiceModelo);
        }else{
            return  null;
        }
    }

    @Override
    public void Update(int id, Modelo objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
