package model.DAO.ser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author mahsa
 */
public class Serializa<T> implements Serializable{
    
    public void Serializa(String file, ArrayList<T> lista) throws FileNotFoundException, IOException, ClassNotFoundException{
        //cria file para persistir o objeto no arquivo
        //parametro file, que é um arquivo, o caminho é colocado onde chamo o metodo para persistir o objeto
        FileOutputStream fileSerializa = new FileOutputStream(file);
        ObjectOutputStream objetoStream = new ObjectOutputStream(fileSerializa);
        objetoStream.writeObject(lista);
        //fecha objetoStream
        objetoStream.close();
        //fecha o arquivo
        fileSerializa.close();
    }
    
    public ArrayList<T> DeSerializa(String file) throws FileNotFoundException, IOException, ClassNotFoundException{
        ArrayList<T> lista = new ArrayList<>();
        FileInputStream fileDeserializa = new FileInputStream(file);
        ObjectInputStream objetoStream = new ObjectInputStream(fileDeserializa);
        lista = (ArrayList<T>)objetoStream.readObject();
        objetoStream.close();
        fileDeserializa.close();
        return lista;
    }
    
}
