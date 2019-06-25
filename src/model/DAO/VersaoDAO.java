
package model.DAO;

import java.util.ArrayList;
import java.util.List;
import model.bo.Versao;

/**
 *
 * @author mahsa
 */
public class VersaoDAO implements InterfaceDAO<Versao>{
    private static List<Versao> listaVersao = new ArrayList<>();

    @Override
    public void Create(Versao objeto) {
        listaVersao.add(objeto);
    }

    @Override
    public List<Versao> Retrive() {
        return listaVersao;
    }

    @Override
    public Versao Retrive(int id) {
        int indiceVersao = listaVersao.indexOf(id);
        if(indiceVersao != -1){
            return listaVersao.get(indiceVersao);
        }
        else{
            return null;
        }
    }

    @Override
    public void Update(int id, Versao objeto) {
        int indiceVersao = listaVersao.indexOf(id);
        if(indiceVersao != -1){
            listaVersao.set(indiceVersao, objeto);
        }
    }

    @Override
    public void Delete(int id) {
        int indiceVersao = -1;
        for (int i = 0; i < listaVersao.size(); i++) {
            if (listaVersao.get(i).getID() == id) {
                indiceVersao = i;
            }
        }
        if (indiceVersao != -1) {
            listaVersao.remove(indiceVersao);
        }
    }
}