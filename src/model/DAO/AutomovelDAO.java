package model.DAO;

import java.util.ArrayList;
import java.util.List;
import model.bo.Automovel;

/**
 *
 * @author mahsa
 */
public class AutomovelDAO implements InterfaceDAO<Automovel>{

    private static List<Automovel> listaAutomovel = new ArrayList<>();

    @Override
    public void Create(Automovel objeto) {
        listaAutomovel.add(objeto);
    }

    @Override
    public List<Automovel> Retrive() {
        return listaAutomovel;
    }

    @Override
    public Automovel Retrive(int id) {
        int indiceAutomovel = listaAutomovel.indexOf(id);
        if (indiceAutomovel != -1) {
            return listaAutomovel.get(indiceAutomovel);
        } else {
            return null;
        }
    }

    @Override
    public void Update(int id, Automovel objeto) {
        int indiceAutomovel = listaAutomovel.indexOf(id);
        if (indiceAutomovel != -1) {
            listaAutomovel.set(indiceAutomovel, objeto);
        }
    }

    @Override
    public void Delete(int id) {
        int indiceAutomovel = -1;
        for (int i = 0; i < listaAutomovel.size(); i++) {
            if (listaAutomovel.get(i).getID() == id) {
                indiceAutomovel = i;
            }
        }
        if (indiceAutomovel != -1) {
            listaAutomovel.remove(indiceAutomovel);
        }
    }

    
}