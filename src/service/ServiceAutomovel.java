package service;

import java.util.List;
import model.DAO.ser.AutomovelDAOSerializa;
import model.bo.Automovel;

public class ServiceAutomovel {
    public static void Incluir(Automovel automovel)
    {
        AutomovelDAOSerializa automovelDAOSer = new AutomovelDAOSerializa();
        automovelDAOSer.Create(automovel);
    }
    
    public static Automovel Buscar(int ID){
        AutomovelDAOSerializa automovelDAOSer = new AutomovelDAOSerializa();
        return automovelDAOSer.Retrive(ID);
    }
    public static List<Automovel> Buscar(){
        AutomovelDAOSerializa automovelDAOSer = new AutomovelDAOSerializa();
        return automovelDAOSer.Retrive();
    }
 
    public static void Atualizar(int id, Automovel automovel){
        AutomovelDAOSerializa automovelDAOSer = new AutomovelDAOSerializa();
        automovelDAOSer.Update(id, automovel);
    }
    
     public static void Deletar(int id){
        AutomovelDAOSerializa automovelDAOSer = new AutomovelDAOSerializa();
        automovelDAOSer.Delete(id);
     }
}
