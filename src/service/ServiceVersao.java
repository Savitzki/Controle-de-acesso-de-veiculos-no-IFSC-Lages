package service;

import java.util.List;
import model.DAO.ser.VersaoDAOSerializa;
import model.bo.Versao;

public class ServiceVersao {
    
    public static void Incluir(Versao versao)
    {
        VersaoDAOSerializa versaoDAOSer = new VersaoDAOSerializa();
        versaoDAOSer.Create(versao);
    }
    
    public static Versao Buscar(int id){
        VersaoDAOSerializa versaoDAOSer = new VersaoDAOSerializa();
        return versaoDAOSer.Retrive(id);
    }
    public static List<Versao> Buscar(){
        VersaoDAOSerializa versaoDAOSer = new VersaoDAOSerializa();
        return versaoDAOSer.Retrive();
    }
 
    public static void Atualizar(int id, Versao versao){
        VersaoDAOSerializa versaoDAOSer = new VersaoDAOSerializa();
        versaoDAOSer.Update(id, versao);
    }
    
     public static void Deletar(int id){
        VersaoDAOSerializa versaoDAOSer = new VersaoDAOSerializa();
        versaoDAOSer.Delete(id);
     }
}
