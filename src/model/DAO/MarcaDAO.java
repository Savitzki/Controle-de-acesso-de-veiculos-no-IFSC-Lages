package model.DAO;

import java.util.ArrayList;
import java.util.List;
import model.bo.Marca;

public class MarcaDAO implements InterfaceDAO<Marca> {

    private static List<Marca> listaMarcas = new ArrayList<>();

    @Override
    public void Create(Marca objeto) {
        listaMarcas.add(objeto);
    }

    @Override
    public List<Marca> Retrive() {
        return listaMarcas;
    }

    @Override
    public Marca Retrive(int id) {

        int indiceMarca = listaMarcas.indexOf(id);
        if (indiceMarca != -1) {
            return listaMarcas.get(indiceMarca);
        } else {
            return null;
        }
    }

    @Override
    public void Update(int id, Marca objeto) {
        int indiceMarca = listaMarcas.indexOf(id);//outra opçao para o for
        if (indiceMarca != -1) {
            listaMarcas.set(indiceMarca, objeto);
        }
    }

    @Override
    public void Delete(int id) {

        int indiceMarca = -1;//PORQUE QUANDO SE TRATA DE INDICE EXISTE O INDICE ZERO(0);
        for (int i = 0; i < listaMarcas.size(); i++) {
            if (listaMarcas.get(i).getID() == id) {
                indiceMarca = i;
            }
        }
        if (indiceMarca != -1) {
            listaMarcas.remove(indiceMarca);
        }
    }

}
