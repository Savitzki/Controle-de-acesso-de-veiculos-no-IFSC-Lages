package service;

import java.util.List;
import model.DAO.ser.ProprietarioDAOSerializa;
import model.bo.Proprietario;

public class ServiceProprietario {
     public static void Incluir(Proprietario proprietario)
    {
        ProprietarioDAOSerializa proprietarioDAOSer = new ProprietarioDAOSerializa();
        proprietarioDAOSer.Create(proprietario);
    }
    
    public static Proprietario Buscar(int ID){
        ProprietarioDAOSerializa proprietarioDAOSer = new ProprietarioDAOSerializa();
        return proprietarioDAOSer.Retrive(ID);
    }
    public static List<Proprietario> Buscar(){
        ProprietarioDAOSerializa proprietarioDAOSer = new ProprietarioDAOSerializa();
        return proprietarioDAOSer.Retrive();
    }
 
    public static void Atualizar(int id, Proprietario proprietario){
        ProprietarioDAOSerializa proprietarioDAOSer = new ProprietarioDAOSerializa();
        proprietarioDAOSer.Update(id, proprietario);
    }
    
     public static void Deletar(int id){
        ProprietarioDAOSerializa proprietarioDAOSer = new ProprietarioDAOSerializa();
        proprietarioDAOSer.Delete(id);
     }
}
