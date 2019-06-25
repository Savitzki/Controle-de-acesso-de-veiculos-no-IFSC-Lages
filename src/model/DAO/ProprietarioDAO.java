
package model.DAO;

import java.util.ArrayList;
import java.util.List;
import model.bo.Proprietario;

/**
 *
 * @author mahsa
 */
public class ProprietarioDAO implements InterfaceDAO<Proprietario>{
    
    private static List<Proprietario> listaProprietario = new ArrayList<>();

    @Override
    public void Create(Proprietario objeto) {
        listaProprietario.add(objeto);
    }

    @Override
    public List<Proprietario> Retrive() {
        return listaProprietario;
    }

    @Override
    public Proprietario Retrive(int id) {
        int indiceProp = listaProprietario.indexOf(id);
        if(indiceProp != -1)
        {
            return listaProprietario.get(indiceProp);
        }
        else{
            return null;
        }
    }

    @Override
    public void Update(int id, Proprietario objeto) {
        int indiceProp = listaProprietario.indexOf(id);
        if(indiceProp != -1){
            listaProprietario.set(indiceProp, objeto);
        }
    }

    @Override
    public void Delete(int id) {
        int indiceProp = -1;
        for(int i=0; i<listaProprietario.size();i++){
            if(listaProprietario.get(i).getID()== id){
                indiceProp = i;
            }
        }
        if(indiceProp != -1){
            listaProprietario.remove(indiceProp);
        }
    }
    
}
