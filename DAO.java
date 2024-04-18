// Aluno: Victor Gabriel Lucio || RA: A2575302


import java.util.List;

public interface DAO<T> {
    T get(int id) throws Exception;
    List<T> getAll();
    T adicionar(T t) throws Exception;
    T modificar(int id, T t) throws Exception;
    boolean deletar(int id);
}
