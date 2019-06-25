package model.DAO;

import java.util.ArrayList;
import java.util.List;
import model.bo.Modelo;

public class ModeloDAO implements InterfaceDAO<Modelo>{

    private static List<Modelo> listaModelos = new ArrayList<>();

    @Override
    public void Create(Modelo objeto) {
        listaModelos.add(objeto);
    }

    @Override
    public List<Modelo> Retrive() {
        return listaModelos;
    }

    @Override
    public Modelo Retrive(int id) {
        int indiceModelo = listaModelos.indexOf(id);
        if (indiceModelo != -1) {
            return listaModelos.get(indiceModelo);
        } else {
            return null;
        }
    }

    @Override
    public void Update(int id, Modelo objeto) {
        int indiceModelo = listaModelos.indexOf(id);
        if (indiceModelo != -1) {
            listaModelos.set(indiceModelo, objeto);
        }
    }

    @Override
    public void Delete(int id) {
        int indiceModelo=-1;
        for(int i=0;i< listaModelos.size();i++)
        {
            if(listaModelos.get(i).getID()== id)
                indiceModelo = i;
        }
        if(indiceModelo != -1)
        listaModelos.remove(indiceModelo);
    }

    
}