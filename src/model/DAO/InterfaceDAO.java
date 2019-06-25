package model.DAO;

import java.util.List;

/*Interface implementada com Generics
*/
/*
Criar todos os metodos a classe DAO
*/
public interface InterfaceDAO <T>{
    //'T' é o tipo generico do objeto, 'objeto' é o objeto em si
    public abstract void Create(T objeto);
    
    public abstract List<T> Retrive();
    
    public abstract T Retrive(int id);
    
    public abstract void Update(int id, T objeto);
    
    public abstract void Delete(int id);
    
}
