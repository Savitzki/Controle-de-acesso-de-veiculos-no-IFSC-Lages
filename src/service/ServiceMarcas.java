package service;

import java.util.List;
import model.DAO.ser.MarcaDAOSerializa;
import model.bo.Marca;

public class ServiceMarcas {

    public static void Incluir(Marca marca) {/* persiste os dados somente na lista
        MarcaDAO marcaDAO = new MarcaDAO();
        marcaDAO.Create(marca);*/

        //persiste os dados com serializaçao
        MarcaDAOSerializa marcaDAOSer = new MarcaDAOSerializa();
        marcaDAOSer.Create(marca);
    }

    public static Marca Buscar(int ID) {
        MarcaDAOSerializa marcaDAOSer = new MarcaDAOSerializa();
        return marcaDAOSer.Retrive(ID);
    }

    public static List<Marca> Buscar() {
        MarcaDAOSerializa marcaDAOSer = new MarcaDAOSerializa();
        return marcaDAOSer.Retrive();
    }

    public static void Atualizar(int ID, Marca marca) {
        MarcaDAOSerializa marcaDAOSer = new MarcaDAOSerializa();
        marcaDAOSer.Update(ID, marca);
    }

    public static void Delete(int ID) {
        MarcaDAOSerializa marcaDAOSer = new MarcaDAOSerializa();
        marcaDAOSer.Delete(ID);
    }

}
