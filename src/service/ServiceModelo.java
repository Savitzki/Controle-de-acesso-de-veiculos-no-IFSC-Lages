package service;

import java.util.List;
import model.DAO.ser.ModeloDAOSerializa;
import model.bo.Modelo;

public class ServiceModelo {

    public static void Incluir(Modelo modelo) {
        ModeloDAOSerializa modeloDAOSer = new ModeloDAOSerializa();
        modeloDAOSer.Create(modelo);
    }

    public static Modelo Buscar(int ID) {
        ModeloDAOSerializa modeloDAOSer = new ModeloDAOSerializa();
        return modeloDAOSer.Retrive(ID);
    }

    public static List<Modelo> Buscar() {
        ModeloDAOSerializa modeloDAOSer = new ModeloDAOSerializa();
        return modeloDAOSer.Retrive();
    }

    public static void Atualizar(int ID, Modelo modelo) {
        ModeloDAOSerializa modeloDAOSer = new ModeloDAOSerializa();
        modeloDAOSer.Update(ID, modelo);
    }

    public static void Deletar(int ID) {
        ModeloDAOSerializa modeloDAOSer = new ModeloDAOSerializa();
        modeloDAOSer.Delete(ID);
    }
}
