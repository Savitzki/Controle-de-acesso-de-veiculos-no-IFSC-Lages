package model.DAO.ser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.DAO.InterfaceDAO;
import model.bo.Marca;

public class MarcaDAOSerializa implements InterfaceDAO<Marca>{   
    
    public static final String fileSerializacao = "C:\\Users\\mahsa\\Documents\\NetBeansProjects\\Controle_acesso_IFSC-v12\\serializa\\serializacaoMarca.ser";

    @Override
    public void Create(Marca objeto){
        
        //abre o arquivo de serializaçao e grava um novo objeto e salva o arquivo
        Serializa serializaMarca = new Serializa<Marca>();
        List<Marca> listaMarcasSerializa =  new ArrayList<>();
        
        try {
            listaMarcasSerializa = serializaMarca.DeSerializa(fileSerializacao);
        } catch (Exception e) {
            //se der erro mostra msg de erro
            e.printStackTrace();
        }
        //adicionar a nova marca na lista
        listaMarcasSerializa.add(objeto);
        
        try {
            serializaMarca.Serializa(fileSerializacao, (ArrayList)listaMarcasSerializa);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
    }

    @Override
    public List<Marca> Retrive() {
        Serializa serializaMarca = new Serializa<Marca>();
         List<Marca> listaMarcasSerializa =  new ArrayList<>();
         
        try {
            listaMarcasSerializa= serializaMarca.DeSerializa(fileSerializacao);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaMarcasSerializa;        
    }

    @Override
    public Marca Retrive(int id) {
        Serializa serializaMarca = new Serializa<Marca>();
        List<Marca> listaMarcasSerializa =  new ArrayList<>();
         
        try {
            listaMarcasSerializa= serializaMarca.DeSerializa(fileSerializacao);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int indiceMarca = listaMarcasSerializa.indexOf(id);
        if(indiceMarca!=-1){
            return listaMarcasSerializa.get(indiceMarca);
        }else{
            return  null;
        }
    }

    @Override
    public void Update(int id, Marca objeto) {
        Serializa serializaMarca = new Serializa<Marca>();
        List<Marca> listaMarcasSerializa =  new ArrayList<>();
        
        try {
            listaMarcasSerializa = serializaMarca.DeSerializa(fileSerializacao);
            
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        
    }

    @Override
    public void Delete(int id) {
        
        
    }
        
    
    
}
