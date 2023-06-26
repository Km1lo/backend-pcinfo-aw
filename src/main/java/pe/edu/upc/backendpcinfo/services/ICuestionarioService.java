package pe.edu.upc.backendpcinfo.services;

import pe.edu.upc.backendpcinfo.entities.Cuestionario;

import java.util.List;

public interface ICuestionarioService {
    public void insert(Cuestionario cuestionario);
    List<Cuestionario> list();
    public void delete(int id);
    public Cuestionario listId(int id);
}
